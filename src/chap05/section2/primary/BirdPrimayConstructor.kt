package chap05.section2.primary

class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird("mybird", 2, "short", "bird")

    coco.color = "yello"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}