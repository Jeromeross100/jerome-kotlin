package com.example.mykotlinlearning.advance

data class Person (
    var firstName: String,
    var lastName: String,
    var age: Int,
    var occupation: String,
    )

fun main() {

    val person: Person? = null

    person?.let {
        println("Today's person is ${person.firstName} ${person.lastName}, aged ${person.occupation} and ${person.age} of Alibaba")

        person.apply {
            firstName = "Elon"
            lastName = "Musk"
            age = 50
            occupation = "SpaceX"
        }.also {
            println("Today's person is ${person.firstName} ${person.lastName}")
        }


        with(person) {
            println("Today's person is $firstName $lastName, aged $age and occupation of Alibaba")

        }

        val result = person.run {
            println(firstName)
        }
    }



}