package ru.fdo.bamk.finrez.employeeservicecommon.coreapi.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class UpdateEmployeeCommand(@TargetAggregateIdentifier val employeeId: String,
                                 val lastName: String,
                                 val firstName: String,
                                 val middleName: String)