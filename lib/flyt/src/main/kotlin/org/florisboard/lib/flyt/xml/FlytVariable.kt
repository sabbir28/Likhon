package org.florisboard.lib.flyt.xml

sealed class FlytVariable<T> {
    abstract val id: String
    abstract val value: T
}

data class FlytStringVariable(
    override val id: String,
    override val value: String,
) : FlytVariable<String>()

data class FlytSetVariable(
    override val id: String,
    override val value: List<String>,
) : FlytVariable<List<String>>()

data class FlytUsetVariable(
    override val id: String,
    override val value: List<String>,
) : FlytVariable<List<String>>()
