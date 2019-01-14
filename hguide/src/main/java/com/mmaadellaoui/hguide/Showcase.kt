package com.mmaadellaoui.hguide

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * Showcase view
 */
class Showcase(val guideContext : GuideContext) : View(guideContext.context){

    init {

        setBackgroundColor(Color.BLUE)
        layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    fun show(){
        guideContext.show(this)
    }
}