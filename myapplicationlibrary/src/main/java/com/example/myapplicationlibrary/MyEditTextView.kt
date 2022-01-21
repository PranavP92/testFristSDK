package com.example.myapplicationlibrary

import android.content.Context
import android.view.animation.Animation
import com.google.android.material.textfield.TextInputEditText

class MyEditTextView(context: Context) : TextInputEditText(context) {

    override fun setTextColor(color: Int) {
        super.setTextColor(color)
    }

    override fun setTextAppearance(resId: Int) {
        super.setTextAppearance(resId)
    }

    override fun setAnimation(animation: Animation?) {
        super.setAnimation(animation)
    }
}