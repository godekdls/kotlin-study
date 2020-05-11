package chap05.section1.define

import chap05.section2.secondary.Bird

class Bird {
    var name = "mybird"
    var wing = 2
    var beak = "short"
    var color = "blue"

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird()
    coco.color = "blue"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}