package ru.fdo.bank.finrez.employeeservicecommon.coreapi.event

import java.time.LocalDate

data class EmployeeCreatedEvent (val employeeId: String,
                                 val lastName: String,
                                 val firstName: String,
                                 val middleName: String,
                                 val position: String,
                                 val dateOfHiring: LocalDate,
                                 val officeId: String)