package com.mmaadellaoui.hguide

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Point
import android.graphics.Rect
import android.view.View
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth



class TargetImpl(val view : View) : Target{

    override fun isReady(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun whenReady(action: (Target) -> Unit) {
        view.post { action.invoke(this)}
    }

    override fun getBounds(): Rect {
        val bounds = Rect()

        val display = (view.context as Activity).getWindowManager().getDefaultDisplay()
        val size = Point()
        display.getSize(size)
        val screenWidth = size.x
        val screenHeight = size.y;

        val l = IntArray(2)
        view.getLocationInWindow(l)
        bounds.left = l[0]
        bounds.top = l[1]
        bounds.right = bounds.left + view.measuredWidth
        bounds.bottom = bounds.top + view.measuredHeight

        return  bounds
    }

    override fun getPosition(): Point {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSnapshot(): Bitmap {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}