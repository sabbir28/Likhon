package org.florisboard.lib.flyt.xml

/*
Not all keys need to be listed explicitly. The following two can be assumed to already exist:

<key id="gap" gap="true" width="1"/>
<key id="space" output=" " stretch="true" width="1"/>

In addition, these 62 keys, comprising 10 digit keys, 26 Latin lower-case keys, and 26 Latin upper-case keys, where the id is the same as the to, are assumed to exist:

<key id="0" output="0"/>
<key id="1" output="1"/>
<key id="2" output="2"/>
…
<key id="A" output="A"/>
<key id="B" output="B"/>
<key id="C" output="C"/>
…
<key id="a" output="a"/>
<key id="b" output="b"/>
<key id="c" output="c"/>
 */

data class FlytKey(
    val id: String,
    val flickId: String?,
    val gap: Boolean,
    val output: String,
    val longPressKeyIds: List<String>,
    val longPressDefaultKeyId: String?,
    val multiTapKeyIds: List<String>,
    val stretch: Boolean,
    val layerId: String,
    val width: Double,
)
