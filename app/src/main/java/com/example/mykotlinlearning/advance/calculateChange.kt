package com.example.mykotlinlearning.advance

fun calculateChange(purchasePrice: Double, moneyGiven: Double) {
    if (moneyGiven < purchasePrice) {
        println("Not enough funds!")
        return
    }

    var change = (moneyGiven - purchasePrice).toBigDecimal().setScale(2, java.math.RoundingMode.HALF_UP).toDouble()
    println("Total Remaining: $$change")

    val denominations = listOf(100.0, 50.0, 20.0, 10.0, 5.0, 1.0, 0.25, 0.10, 0.05, 0.01)
    val changeBreakdown = mutableMapOf<Double, Int>()

    for (denomination in denominations) {
        if(change >= denomination) {
            val count = (change/denomination).toInt()
            change -= count * denomination
            change = (change * 100).toInt() / 100.0
            changeBreakdown[denomination] = count
        }
    }

    println("Change breakdown:")
    for ((denomination, count) in changeBreakdown) {
        if (denomination >= 1) {
            println("$count x $${denomination.toInt()} bill(s)")
        } else {
            println("$count x ${"%.2f".format(denomination)} coin(s)")
        }
        }
    }

fun main() {
    print("Enter purchase price: ")
    val purchasePrice = readln().toDouble()

    print("Enter cash given: ")
    val moneyGiven = readln().toDouble()

    calculateChange(purchasePrice, moneyGiven)
}