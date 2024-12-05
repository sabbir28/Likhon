package org.florisboard.lib.flyt.touch

import org.florisboard.lib.flyt.xml.FlytKeyboard

class TouchKeyboard(val base: FlytKeyboard) {
    private val layers = mutableMapOf<String, TouchLayer>()

    fun compute(widthPx: Int, heightPx: Int) {}
}
