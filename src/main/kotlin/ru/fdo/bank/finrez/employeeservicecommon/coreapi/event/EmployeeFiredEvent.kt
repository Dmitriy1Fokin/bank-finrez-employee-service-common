package ru.fdo.bank.finrez.employeeservicecommon.coreapi.event

import java.time.LocalDate

data class EmployeeFiredEvent(val employeeId: String,
                              val dateOfDismissal: LocalDate)