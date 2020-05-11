package chap07.coffeeMaker

class MyDripCoffeeModule : CoffeModule {
    companion object {
        val electricHeater : ElectricHeater by lazy {
            ElectricHeater()
        }
    }

    private val _thermosiphon: Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }

    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}