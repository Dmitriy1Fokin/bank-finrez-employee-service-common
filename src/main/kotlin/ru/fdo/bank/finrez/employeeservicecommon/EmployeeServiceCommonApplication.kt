package ru.fdo.bank.finrez.employeeservicecommon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class EmployeeServiceCommonApplication

fun main(args: Array<String>) {
    runApplication<EmployeeServiceCommonApplication>(*args)
}
