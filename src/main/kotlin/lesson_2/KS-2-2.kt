package org.example.lesson_2

fun main() {

    val workers = 50
    val interns = 30
    val oneWorkerSalary = 30000
    val oneInternSalary = 20000

    val workersSalary = workers * oneWorkerSalary
    val allStaffSalary = workersSalary + interns * oneInternSalary
    val averageSalary = allStaffSalary / (workers + interns)

    println(workersSalary)
    println(allStaffSalary)
    println(averageSalary)


}