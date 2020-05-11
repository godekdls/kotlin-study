package chap05.section5.internal

internal class InternalClass {
    internal var i = 1
    internal fun icFunc() = i++
    fun access() {
        icFunc()
    }
}

class Other {
    internal val ic = InternalClass()
    fun test() {
        ic.i
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}