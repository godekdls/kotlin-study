package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun  worksInSerial() {
    GlobalScope.launch {
        val one = chap11.section2.starttest.doWork1()
        val two = doWork2()
        println("Kotlin One : ${one}")
        println("Kotlin Two : ${two}")
    }
}

private fun workInParallel() {
    val one = GlobalScope.async {
        chap11.section2.starttest.doWork1()
    }
    val two = GlobalScope.async {
        doWork2()
    }

    GlobalScope.launch {
        val combined = one.await() + " " + two.await()
        println("Kotlin Combined : $combined")
    }
}

fun main() {
//    worksInSerial()
    workInParallel()
    Thread.sleep(5000)
}