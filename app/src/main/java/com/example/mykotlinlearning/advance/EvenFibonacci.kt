package com.example.mykotlinlearning.advance

fun getEvenFibonacci(n: Int): List<Int> {
    val fibonacciRank = mutableListOf(1, 1)
    var next = 0

    while (true) {
        next = fibonacciRank[fibonacciRank.size - 1] + fibonacciRank[fibonacciRank.size - 2]
        if (next > n) break
        fibonacciRank.add(next)
    }

    return fibonacciRank.filter {it % 2 == 0}
}

fun main() {
    println(getEvenFibonacci(10))
}
