package ro.homplex.foodmotivation.notification

import android.Manifest
import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.util.Base64
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import ro.homplex.foodmotivation.FoodUtils
import ro.homplex.foodmotivation.MainActivity
import ro.homplex.foodmotivation.R
import ro.homplex.foodmotivation.data.DayMenu
import ro.homplex.foodmotivation.ui.serializeList
import java.io.ByteArrayInputStream
import java.io.ObjectInputStream
import java.util.Calendar
import kotlin.random.Random

class AlarmBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val listString = intent?.getStringExtra("list")
        Log.d("adrian", "here")
        val myList = deserializeList(listString)
        showNotification(context)

        val _intent = Intent(context, AlarmBroadcastReceiver::class.java)
        _intent.putExtra("list", serializeList(myList))
        val pendingIntent = PendingIntent.getBroadcast(
            context,
            0,
            _intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.cancel(pendingIntent)
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = System.currentTimeMillis()
        calendar.add(Calendar.DAY_OF_YEAR, 1) // Set the calendar to the next day
        calendar[Calendar.HOUR_OF_DAY] = 17
        calendar[Calendar.MINUTE] = 21
        calendar[Calendar.SECOND] = 0
        if (calendar.timeInMillis < System.currentTimeMillis()) {
            calendar.add(Calendar.DAY_OF_YEAR, 1)
        }
        alarmManager.setExact(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            pendingIntent
        )
    }

    fun showNotification(applicationContext: Context) {
        val myList = FoodUtils.getMenuList()
        createNotificationChannel(applicationContext)

        val randomIndex = Random.nextInt(myList.size)

        // Retrieve the random DayMenu item using the random index
        val randomDayMenu = myList[randomIndex]

        val notificationIntent = Intent(applicationContext, MainActivity::class.java)
        notificationIntent.putExtra("day_menu", randomDayMenu)
        notificationIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        val pendingIntent = PendingIntent.getActivity(
            applicationContext,
            0,
            notificationIntent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        val notification = NotificationCompat.Builder(applicationContext,
            CHANNEL_ID
        )
            .setContentTitle("This is your menu")
            .setContentText("This can be your food menu for today:")
            .setSmallIcon(R.drawable.ic_notification)
            .setContentIntent(pendingIntent) // Setting PendingIntent to open MainActivity
            .setAutoCancel(true) // Dismiss notification when tapped
            .setStyle(
                NotificationCompat.BigTextStyle().bigText(
                    "-Breakfast:${randomDayMenu.breakfast.name}\n" +
                            "-Lunch:${randomDayMenu.lunch.name}\n-Dinner:${randomDayMenu.dinner.name}"
                )
            )
            .build()

        if (ActivityCompat.checkSelfPermission(
                applicationContext,
                Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            NotificationManagerCompat.from(applicationContext).notify(NOTIFICATION_ID, notification)
        }
    }

    private fun createNotificationChannel(applicationContext: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Daily Notifications"
            val descriptionText = "Daily notifications channel"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }

            val notificationManager =
                applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun deserializeList(serializedList: String?): List<DayMenu> {
        if (serializedList.isNullOrEmpty()) return emptyList()

        val decodedBytes = Base64.decode(serializedList, Base64.DEFAULT)
        val inputStream = ByteArrayInputStream(decodedBytes)
        val objectInputStream = ObjectInputStream(inputStream)
        @Suppress("UNCHECKED_CAST")
        val list = objectInputStream.readObject() as List<DayMenu>
        objectInputStream.close()
        return list
    }

    companion object {
        private const val CHANNEL_ID = "HourlyChannelId"
        private const val NOTIFICATION_ID = 12345
    }
}