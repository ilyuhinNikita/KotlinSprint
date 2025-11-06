package org.example.lesson_1

const val timeInterval = 60
fun main() {

    val seconds = 6480

    val minutes = (seconds / timeInterval)
    val hours = (minutes / timeInterval)
    val leftMinutes = (minutes % timeInterval)
    val leftSeconds = (seconds % timeInterval)

    val time = "%02d:%02d:%02d;".format(hours, leftMinutes, leftSeconds)
    println(time)

}