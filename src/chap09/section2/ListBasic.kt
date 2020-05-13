package chap09.section2

fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: MutableList<String> = mutableListOf("one", "two", "three")

    names.add("four")
    for (name in names) print(name)
    println()

    numbers.forEach { print(it) }
    println()

    val list = emptyList<String>()
    val mutableList = list.toMutableList()
    mutableList.add("not empty")
    println(mutableList)
}