package ir.smr.kazemi.BaseApp

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment


fun AppCompatActivity.requestPermissionLauncher(permission: String, callback: (Boolean) -> Unit) {

    val request =
        this.registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            callback(isGranted)
        }

    request.launch(permission)

}

fun Fragment.requestPermissionLauncher(permission: String, callback: (Boolean) -> Unit) {

    val request =
        this.registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            callback(isGranted)
        }

    request.launch(permission)
}

fun Any.log(mes: String) {
    Log.d("TAG", mes)
}

fun Activity.toast(message: String) {

    shortToast(this, message)

}

private fun shortToast(context: Context, mes: String) {

    Toast.makeText(context, mes, Toast.LENGTH_SHORT).show()
}

fun Activity.longToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Activity.customToast(message: String, layout: Int) {

    Toast(this).apply {


        view = layoutInflater.inflate(layout, null)

        view.findViewById<TextView>(R.id.txt_mes).text = message

        duration = Toast.LENGTH_LONG

        //        setGravity(Gravity.BOTTOM, 0, 100)

        show()
    }

}
