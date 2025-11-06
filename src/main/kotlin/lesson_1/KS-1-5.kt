package org.example.lesson_1

const val TIME_INTERVAL = 60

fun main() {

    val seconds = 6480

    val minutes = seconds / TIME_INTERVAL
    val hours = minutes / TIME_INTERVAL
    val leftMinutes = minutes % TIME_INTERVAL
    val leftSeconds = seconds % TIME_INTERVAL

    val time = "%02d:%02d:%02d;".format(hours, leftMinutes, leftSeconds)
    println(time)

}