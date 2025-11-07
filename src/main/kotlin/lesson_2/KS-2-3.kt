package org.example.lesson_2

    const val TIME_CONST = 60

fun main() {

    val departureHour = 9
    val departureMinutes = 39
    val travelMinutes = 457

    val travelHour = travelMinutes / TIME_CONST
    var arrivalHour = departureHour + travelMinutes / TIME_CONST
    val leftMinutes = travelMinutes - travelHour * TIME_CONST
    val allMinutes = departureMinutes + leftMinutes
    val arrivalMinutes = (departureMinutes + leftMinutes) % TIME_CONST

    if (allMinutes >= TIME_CONST) {
        println(arrivalHour + 1)
    }


    println(travelHour)
    println(arrivalHour)
    println(leftMinutes)
    println(allMinutes)
    println(arrivalMinutes)
}
