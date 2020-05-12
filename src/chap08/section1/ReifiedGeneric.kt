package chap08.section1

import java.lang.IllegalStateException

/*
int를 인자로 받아서 제네릭타입으로 지정된 타입으로 변환
 */
inline fun <reified T> getType(value: Int): T {
    println(T::class)
    println(T::class.java)

    return when (T::class) {
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported")
    }
}

fun main() {
    val result = getType<Float>(10)
    println("result = ${result}(${result::class.qualifiedName})")

    val result2 = getType<Int>(10)
    println("result = ${result2}(${result2::class.qualifiedName})")

    val result3 = getType<String>(10)
    println("result = ${result3}(${result3::class.qualifiedName})")
}