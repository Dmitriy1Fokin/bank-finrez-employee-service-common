package ru.fdo.bamk.finrez.employeeservicecommon.coreapi.command

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.time.LocalDate

data class CreateEmployeeCommand(@TargetAggregateIdentifier val employeeId: String,
                                 val lastName: String,
                                 val firstName: String,
                                 val middleName: String,
                                 val position: String,
                                 val dateOfHiring: LocalDate,
                                 val officeId: String)