/*
패키지가 지정되지 않는 파일은 default 패키지에 포함된다
 */

/*
JVM에서 실행될 때 main()함수가 있는 파일 이름을 기준으로 자바 클래스를 만들기 때문에
선언한 클래스가 없는데도 main()함수가 실행될 수 있다
 */

fun main(args: Array<String>) {
    println("Hello Kotlin!")
}