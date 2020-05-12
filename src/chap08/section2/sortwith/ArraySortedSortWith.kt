package chap08.section2.sortwith

import chap08.section2.Product

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
            Product("Snow Ball", 879.00),
            Product("Smart Phone", 999.00),
            Product("Drone", 240.00),
            Product("Mouse", 333.55),
            Product("Keyboard", 125.99),
            Product("Monitor", 1500.99),
            Product("Tablet", 512.99)
    )

    products.sortWith(
            Comparator<Product> { p1, p2 ->
                when {
                    p1.price > p2.price -> -1
                    p1.price == p2.price -> 0
                    else -> 1
                }
            }
    )
    products.forEach { println(it) }
    println("----------------------------")

    // (T) -> Comparable<*>? 타입의 셀렉터 가변인자를 인자로 받는 compareBy
    // comparator 리턴
    products.sortWith(compareBy({it.name}, {it.price}))
    products.forEach { println(it) }
}