package ir.smr.kazemi.BaseApp

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener {

            systemHandleRequestPermission()

        }

    }


    private fun systemHandleRequestPermission() {


    }

    private fun traditionalRequestPermission() {


    }
}
