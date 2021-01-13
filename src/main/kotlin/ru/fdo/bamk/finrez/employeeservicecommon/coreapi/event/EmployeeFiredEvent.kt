package ru.fdo.bamk.finrez.employeeservicecommon.coreapi.event

import java.time.LocalDate

data class EmployeeFiredEvent(val employeeId: String,
                              val dateOfDismissal: LocalDate)