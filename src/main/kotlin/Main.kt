import kotlinx.coroutines.*

fun main() = runBlocking{
    val coroutineScope = CoroutineScope(Dispatchers.IO)

    println("Start")
    val job = coroutineScope.launch {
        runCoroutine()
        runSecondCoroutine()
        runThirdCoroutine()
    }

    job.join()
    println("Stop")
}

suspend fun runCoroutine(){
    delay(2000)
    println("First")
}

suspend fun runSecondCoroutine(){
    delay(2000)
    println("Second")
}

suspend fun runThirdCoroutine(){
    delay(2000)
    println("Third")
}