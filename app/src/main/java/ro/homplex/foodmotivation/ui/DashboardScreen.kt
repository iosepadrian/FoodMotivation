package ro.homplex.foodmotivation.ui

import android.Manifest
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Context.ALARM_SERVICE
import android.content.Intent
import android.os.Build
import android.util.Base64
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import ro.homplex.foodmotivation.FoodUtils
import ro.homplex.foodmotivation.MainActivity
import ro.homplex.foodmotivation.data.DayMenu
import ro.homplex.foodmotivation.notification.AlarmBroadcastReceiver
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream
import java.util.Calendar
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun DashboardScreen(navController: NavController) {

    val context = LocalContext.current

    val foodList = FoodUtils.getMenuList()

    val notificationPermission = arrayOf(
        Manifest.permission.POST_NOTIFICATIONS
    )

    val activity = context as MainActivity

    var notificationClicked by remember { mutableStateOf(false) }

    Surface {
        val dayMenu = activity.intent.getSerializableExtra("day_menu") as? DayMenu
        if (dayMenu != null) {
            notificationClicked = true
            // Handle the recmeived DayMenu object
            Log.d("adrian", dayMenu.toString())
        }

        if (notificationClicked) {
            notificationClicked = false
            //TODO open another screen
        }
        if (Build.VERSION.SDK_INT >= 33) {
            val notificationPermissionLauncher = rememberLauncherForActivityResult(
                contract = ActivityResultContracts.RequestMultiplePermissions(),
                onResult = { permissions ->
                    val permissionsGranted = permissions.values.reduce { acc, isPermissionGranted ->
                        acc && isPermissionGranted
                    }

                    if (!permissionsGranted) {
                        //showLocationDialog = true
                    } else {
                        startAlarmBroadcastReceiver(context, foodList)
                    }
                })
            LaunchedEffect(Unit) {
                notificationPermissionLauncher.launch(notificationPermission)
            }
        } else {
            startAlarmBroadcastReceiver(context, foodList)
        }
    }
}

fun startAlarmBroadcastReceiver(context: Context, list: List<DayMenu>) {
    val _intent = Intent(context, AlarmBroadcastReceiver::class.java)
    _intent.putExtra("list", serializeList(list))
    val pendingIntent = PendingIntent.getBroadcast(
        context,
        0,
        _intent,
        PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
    )
    val alarmManager = context.getSystemService(ALARM_SERVICE) as AlarmManager
    alarmManager.cancel(pendingIntent)
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = System.currentTimeMillis()
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

fun serializeList(ingredientList: List<DayMenu>): String {
    val outputStream = ByteArrayOutputStream()
    val objectOutputStream = ObjectOutputStream(outputStream)
    objectOutputStream.writeObject(ingredientList)
    objectOutputStream.close()
    return Base64.encodeToString(outputStream.toByteArray(), Base64.DEFAULT)
}