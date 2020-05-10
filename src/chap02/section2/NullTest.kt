package chap02.section2

fun main() {
//    var str1 = "Hello Kotlin"  null할당 시 컴파일에러
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1")

//    println("str1: $str1 length: ${str1.length}") 컴파일 에러
    // 세이프콜 - null 출력
    println("str1: $str1 length: ${str1?.length}")
    // non-null 단정기호 - 런타임 NPE
    println("str1: $str1 length: ${str1!!.length}")
}