package com.dev.taskpicker

import android.widget.Button
import android.widget.TextView

class TimePicker {

    fun pickEstimatedTime(value: TextView, plusBtn: Button, minusBtn: Button ) {
        var id = 0

        value.text = "" + id

        plusBtn.setOnClickListener {
            value.text = "" + ++id
        }

        minusBtn.setOnClickListener {
            value.text = "" + --id
        }
    }

}