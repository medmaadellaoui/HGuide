package com.mmaadellaoui.hguide

import android.graphics.Bitmap
import android.graphics.Point
import android.graphics.Rect

interface Target {

    /**
     * @return Boolean TRUE if the target is ready to be processed
     */
    fun isReady() : Boolean

    /**
     * Register an action for a late execution when the target get ready
     */
    fun whenReady(action : (Target) -> Unit)

    /**
     * @return Rect The bounds of the target
     */
    fun getBounds() : Rect

    /**
     * @return Point The position of the target relatively to the context
     */
    fun getPosition() : Point


    /**
     * @return Bitmap An exact copy of the target UI as an image like a screenshot
     */
    fun getSnapshot() : Bitmap

}