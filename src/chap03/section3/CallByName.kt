package chap03.section3

fun main() {
    val result = callByName(otherLamdba)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()
}

val otherLamdba: () -> Boolean = {
    println("otherLamdba function")
    true
}