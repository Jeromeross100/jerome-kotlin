package com.example.mykotlinlearning.advance

fun main() {
    val circle = Circle(5.5)
    val area = circle.area()
    println("Area of circle is $area")
    val perimeter = circle.perimeter()
    println("Perimeter of circle is $perimeter")
}

fun Circle.newFormula(): Double {
    return 12 * radius
}

fun Circle.perimeter(): Double {
    return 2 * Math.PI * radius
}

class Circle(val radius: Double) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
}