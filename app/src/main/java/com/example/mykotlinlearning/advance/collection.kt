package com.example.mykotlinlearning.advance

fun main() {
    val list: List<Int> = listOf(1,2,3,4,5)
    val set: Set<Int> = setOf(1,2,1,3,1,4,5,1)
    val map: Map<String, Int> = mapOf(
        Pair("Carlos", 15),
        "Haoming" to 12,
        "Adam" to 12,
    )

    val mutableList : MutableList<Int> = mutableListOf(1,2,3)
    val mutableSet: MutableSet<Int> = mutableSetOf(1,2,3)
    mutableList.add(4)
    mutableList.add(5)

    //mutableSetOf = mutableSetOf()

    println()
}