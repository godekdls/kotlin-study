package chap07.coffeeMaker

class CoffeeMaker(val coffeModule: CoffeModule) {
    fun brew() {
        val theSiphon: Thermosiphon = coffeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, here! Enjoy")
        theSiphon.off()
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}