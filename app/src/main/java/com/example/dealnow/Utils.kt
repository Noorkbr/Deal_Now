package com.example.dealnow

import android.widget.EditText

fun EditText.isEmpty(): Boolean{
    return if (this.text.toString().isEmpty()){
        this.error = "This Filed Need to be Fill up"
        true
    }else{
        false

    }


}