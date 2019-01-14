package com.mmaadellaoui.hguide

import android.graphics.Rect
import android.view.ViewGroup
import android.widget.FrameLayout

/**
 * A simple implementation of the Showcase Composer
 */
class SimpleComposer(guideContext: GuideContext, target: Target) : Composer(guideContext, target){

    override fun create(): Showcase {

        val showcase = Showcase(guideContext)

        target.whenReady {
            //positioning the showcase view
            val targetBounds = target.getBounds()
            showcase.x = targetBounds.left.toFloat()
            showcase.y = targetBounds.top.toFloat()

            showcase.layoutParams = FrameLayout.LayoutParams(
                    targetBounds.width(),
                    targetBounds.height()
            )
        }

        return showcase

    }

}