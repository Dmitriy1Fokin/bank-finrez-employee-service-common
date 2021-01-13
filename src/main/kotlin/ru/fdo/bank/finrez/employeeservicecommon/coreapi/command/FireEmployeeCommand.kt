package ru.fdo.bank.finrez.employeeservicecommon.coreapi.command

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.time.LocalDate

data class FireEmployeeCommand (@TargetAggregateIdentifier val employeeId: String,
                                val dateOfDismissal: LocalDate)