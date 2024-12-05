package org.florisboard.lib.flyt.touch

sealed class TouchAction {
    inner class Output(val ch: String)
    inner class SwitchLayer(val to: String)
}
