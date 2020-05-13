package chap11.section3

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val channel = Channel<Int>(3)
    val sender = launch(coroutineContext) {
        repeat(10) {
            println("sending $it")
            channel.send(it)
        }
    }
    delay(1000L)
    sender.cancel()
}