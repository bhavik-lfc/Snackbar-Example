package com.ktxandroid.snackbarexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ktxandroid.snackbarexample.utils.SnackbarManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simple_sb.setOnClickListener {
            SnackbarManager.show(cl_main, "Hello from KTX Android")
        }

        action_sb.setOnClickListener {
            SnackbarManager.snackbarWithOperation(
                cl_main,
                "Hello from KTX Android",
                "OK",
                snackListener
            )
        }

        custom_sb.setOnClickListener {
            SnackbarManager.customSnackBar(
                cl_main,
                "Hello from KTX Android",
                "OK",
                snackListener
            )
        }

    }

    private val snackListener: () -> Unit = {
        //Action to perform goes here
        Toast.makeText(this@MainActivity, "Thank you", Toast.LENGTH_LONG).show()
    }

}
