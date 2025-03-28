package com.example.mykotlinlearning.advance

fun largestNumber(numbers: List<Int>, count: Int): List<Int> {
    if (numbers.size <= count) return numbers
    return numbers.sortedDescending().take(count)
}

fun main() {

    val list = listOf(1, 7, 3, 5)
    println(largestNumber(list, 2))
}