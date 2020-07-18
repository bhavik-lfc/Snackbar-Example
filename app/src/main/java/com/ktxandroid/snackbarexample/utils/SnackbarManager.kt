package com.ktxandroid.snackbarexample.utils

import android.graphics.Color
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.ktxandroid.snackbarexample.R

object SnackbarManager {

    fun show(view: View, text: String) {
        Snackbar.make(view, text, Snackbar.LENGTH_SHORT).show()
    }

    fun snackbarWithOperation(view: View, text: String, actionText: String, listener: () -> Unit) {
        Snackbar.make(view, text, Snackbar.LENGTH_LONG)
            .setAction(actionText) {
                listener.invoke()
            }
            .show()
    }

    fun customSnackBar(view: View, text: String, actionText: String, listener: () -> Unit) {
        val snackbar =
            Snackbar.make(view, text, Snackbar.LENGTH_INDEFINITE)
                .setAction(actionText) {
                    listener.invoke()
                }
                //Setting background color
                .setBackgroundTint(Color.BLACK)
                //Setting action button color
                .setActionTextColor(Color.RED)


        //Setting Text Color
        val textView = snackbar.view.findViewById(R.id.snackbar_text) as TextView
        textView.setTextColor(Color.YELLOW)
        snackbar.show()

    }

}