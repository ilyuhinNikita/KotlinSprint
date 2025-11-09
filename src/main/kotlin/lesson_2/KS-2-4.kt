package org.example.lesson_2

const val DIVIDER = 100

fun main() {

    val crystal = "Crystal"
    val iron = "Iron"
    val crystalHave = 7
    val ironHave = 11
    val buffPercentage = 20

    val crystalBuff = crystalHave * buffPercentage / DIVIDER
    val ironBuff = ironHave * buffPercentage / DIVIDER

    println("$crystal:$crystalBuff")
    println("$iron:$ironBuff")

}