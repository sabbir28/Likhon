package org.florisboard.lib.flyt.xml

import java.util.*

data class FlytKeyboard(
    val conformsTo: Int, // >= 45
    val primaryLocale: Locale,
    val secondaryLocales: List<Locale>,
    val version: String,
    val info: FlytInfo,
    val settings: FlytSettings,
    val displays: List<FlytDisplay>,
    val displayOptions: FlytDisplayOptions,
    val keys: List<FlytKey>,
    val layers: List<FlytLayer>,
    val variables: List<FlytVariable<*>>
)
