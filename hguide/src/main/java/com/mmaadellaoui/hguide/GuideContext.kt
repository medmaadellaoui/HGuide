package com.mmaadellaoui.hguide

import android.graphics.Color
import android.support.annotation.IdRes
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout

/**
 * The GuideContext is a class that encapsulate the guide views and manage
 * all the interactions with the container, a GuideContext may change the way
 * how view are integrated with the main view (the target UI) depending on Android api
 * levels or device manufacturer
 */
class GuideContext(val container : ViewGroup) {

    val context get() = container.context

    init {
        val overlay = FrameLayout(context)
        overlay.layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
        )
        overlay.setBackgroundColor(Color.BLACK)
        overlay.alpha = 0.8f
        container.addView(overlay)
    }

    /**
     * Create a composer for the target given in args
     */
    fun apply(target : Target) : Composer{
        return SimpleComposer(this, target)
    }

    fun apply(@IdRes idRes: Int) : Composer{
        return apply(container.findViewById(idRes) as View)
    }

    fun apply(view : View) : Composer{
        return apply(TargetImpl(view))
    }

    fun show(showcase: Showcase) {
        container.addView(showcase)
    }

}