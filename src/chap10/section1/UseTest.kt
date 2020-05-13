package chap10.section1

import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("/Users/user/Workspace/kotlin-study/test.txt")).use {
        it.println("hello")
    }
}