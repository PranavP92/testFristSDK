package com.example.myapplicationlibrary

import android.content.Context
import android.util.AttributeSet
import android.view.animation.Animation
import com.google.android.material.textfield.TextInputEditText

class MyEditTextView(context: Context, attrs: AttributeSet?) : TextInputEditText(context, attrs) {

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