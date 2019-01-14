package com.mmaadellaoui.hguide

/**
 * This class serve as a base to build Showcase view
 */
abstract class Composer(val guideContext: GuideContext, val target: Target){

    /**
     * Create the final Showcase view
     */
    abstract fun create() : Showcase

}