package chap11.section3

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import java.util.*

fun main() = runBlocking {
    val routine1 = GlobalScope.produce {
        kotlinx.coroutines.delay(Random().nextInt(1000).toLong())
        send("A")
    }
    val routine2 = GlobalScope.produce {
        kotlinx.coroutines.delay(Random().nextInt(1000).toLong())
        send("B")
    }
    val result = select<String> {
        routine1.onReceive { result -> result }
        routine2.onReceive { result -> result }
    }
    println("Result was $result")
}