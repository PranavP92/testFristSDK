package com.example.myapplicationlibrary

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.animation.Animation
import android.widget.RelativeLayout
import java.util.ArrayList

class MyLayout(context: Context?, attrs: AttributeSet?) : RelativeLayout(context, attrs) {


    override fun addView(child: View?) {
        super.addView(child)
    }

    override fun addTouchables(views: ArrayList<View>?) {
        super.addTouchables(views)
    }

    override fun setAlpha(alpha: Float) {
        super.setAlpha(alpha)
    }

    override fun setAnimation(animation: Animation?) {
        super.setAnimation(animation)
    }

    override fun setBackgroundColor(color: Int) {
        super.setBackgroundColor(color)
    }
}