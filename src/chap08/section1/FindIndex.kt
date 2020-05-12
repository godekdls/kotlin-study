package chap08.section1

fun <T> find(a: Array<T>, target: T): Int {
    for (i in a.indices) {
        if (a[i] == target) return i
    }
    return -1
}

fun main() {
    var arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Durian")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4)

    println("arr.indices ${arr1.indices}")
    println(find<String>(arr1, "Cherry"))
    println(find(arr2, 2))
}