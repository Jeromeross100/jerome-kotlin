package com.example.mykotlinlearning.advance

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope


suspend fun main() {
    //GlobalScope.launch(Dispatchers.Main) {
    runBlocking {
        println("Hello")
        delay(2000L)
        println("Carlos")
        delay(2000L)
        println("Jerome")
        delay(1000L)

    }

    delay(1000L)
    println("Everything should be printed")


      coroutineScope {
          launch {
              delay(1000L)
              println("World")
          }

        }
    }

