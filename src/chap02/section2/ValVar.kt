package chap02.section2

fun main() {
    // 자료형 추론
    val number = 10 // Int로 추론
    var language = "Korean" // String으로 추론

    // 명시적 지정
    val secondNumber : Int = 20

    // 재할당
    language = "English"

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}