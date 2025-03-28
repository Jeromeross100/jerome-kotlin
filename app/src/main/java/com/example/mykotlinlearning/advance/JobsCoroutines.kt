package com.example.mykotlinlearning.advance

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.async
import kotlinx.coroutines.GlobalScope

@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking {

    val job = GlobalScope.launch {
        delay(2000L)
        println("World")
    }

    val job1 = GlobalScope.async {
        delay(1000L)
        println("Hello")
    }

    val job2 = runBlocking {
        delay(1000L)
        println("Blocked")
    }

    job.join()
}

