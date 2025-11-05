package org.example.lesson_1

fun main() {

    val seconds = 6480
    val minutes = (seconds / 60)
    val hours = (minutes / 60)
    val leftMinutes = (minutes % 60)
    val leftSeconds = (seconds % 60)

//    println(minutes)
//    println(hours)
//    println(leftMinutes)
//    println(leftSeconds)

    val time = String.format("%02d:%02d:%02d;", hours, leftMinutes, leftSeconds)
    println(time)

}