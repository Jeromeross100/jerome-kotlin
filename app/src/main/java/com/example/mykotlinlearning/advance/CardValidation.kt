package com.example.mykotlinlearning.advance

import android.os.Build
import androidx.annotation.RequiresApi

/*
* Banks
* - list of banks -
* ACME 1121
* ALFA 1111
* AMEX 3796
*
* Sample input
*
* First input -> 1121-0000-0000-0312
* Second input -> 03/12
*
* -> First 4 digit represent company
* -> Last 4 digit represent expiry date
*
*   Assuming card and date as input write a function to verify valid card numbers
* */

// Define the banks map

import java.util.Scanner

val banks = mapOf(
    "1121" to "ACME",
    "1111" to "ALFA",
    "3796" to "AMEX"
)

fun isValidCard(cardNumber: String, expiryDate: String): Boolean {
    val parts = cardNumber.split("-")
    if (parts.size != 4) return false

    val bankCode = parts[0]
    val cardExpiry = parts[3]

    return banks.containsKey(bankCode) && expiryDate.replace("/", "") == cardExpiry
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter card number: ")
    val cardNumber = scanner.nextLine()

    print("Enter expiry date (MM/YY): ")
    val expiryDate = scanner.nextLine()

    if (isValidCard(cardNumber, expiryDate)) {
        println("Valid card")
    } else {
        println("Invalid card")
    }
}

