package com.example.myapplicationlibrary.effects

import android.view.View
import android.animation.Animator

import android.view.animation.DecelerateInterpolator




object RotationEffect {
    fun rotate(view:View){
        with(view) {
            animate()
                .scaleY(1F)
                .rotationY(50f)
                .alpha(0.5f)
                .setStartDelay(100)
                .rotationX(50f)
                .setDuration(200)
                .setInterpolator(DecelerateInterpolator())
                .setListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator) {}
                    override fun onAnimationEnd(animation: Animator) {}
                    override fun onAnimationCancel(animation: Animator) {}
                    override fun onAnimationRepeat(animation: Animator) {}
                }).start()
        }
    }
}