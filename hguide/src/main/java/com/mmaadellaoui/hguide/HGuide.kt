package com.mmaadellaoui.hguide

import android.view.ViewGroup
import android.view.Window

/**
 * The Main facade to create showcase views
 */
object HGuide

/**
 * Create a context from a Window object
 */
public fun HGuide.from(window : Window) : GuideContext {
    return from(window.decorView as ViewGroup)
}

/**
 * Create a context from a specific ViewGroup
 */
public fun HGuide.from(viewGroup : ViewGroup) : GuideContext {

    return GuideContext(viewGroup)
}