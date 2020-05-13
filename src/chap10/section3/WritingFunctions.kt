package chap10.section3

import java.io.File

fun main() {
    val outString = "안녕하세요!\tHello\nWorld!."
    val path = "/Users/user/Workspace/kotlin-study/test.txt"

    File(path).bufferedWriter().use { it.write(outString) }
}