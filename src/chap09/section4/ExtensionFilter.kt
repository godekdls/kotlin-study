package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    println(list.filter { it % 2 == 0 })
    println(list.filterNot { it % 2 == 0 })
    println(listWithNull.filterNotNull())

    println("filteredIndex: ${list.filterIndexed { idx, value -> idx != 1 && value % 2 == 0 }}")
    val mutList = mutableListOf<Int>()
    list.filterIndexedTo(mutList) {idx, value -> idx != 1 && value % 2 == 0}
    println("filteredIndexedTo: $mutList")

    println("filterKeys: ${map.filterKeys { it != 11 }}")
    println("filterValues: ${map.filterValues { it != "Java" }}")
    println("filterIsInstance: ${listMixed.filterIsInstance<String>()}")

    println("slice: ${list.slice(listOf(1, 2, 3))}")

    println(list.take(2))
    println(list.takeLast(2))
    println(list.takeWhile { it < 3 })
    println(list.drop(3))
    println(list.dropWhile { it < 3 })
    println(list.dropLastWhile { it > 3 })

    println("distinct: ${listRepeated.distinct()}")
    println("distinct: ${listRepeated.intersect(listOf(5, 6, 7, 8))}")
}