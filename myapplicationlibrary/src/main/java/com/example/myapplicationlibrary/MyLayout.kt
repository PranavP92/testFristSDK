package com.example.myapplicationlibrary

import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.widget.RelativeLayout
import java.util.ArrayList

class MyLayout(context: Context?) : RelativeLayout(context) {

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
}