package chap08.section1

class Box<T>(t: T) {
    var name = t
}

fun main() {
    val box1 = Box<Int>(1)
    val box2 = Box<String>("hello")
    println(box1.name)
    println(box2.name)
}