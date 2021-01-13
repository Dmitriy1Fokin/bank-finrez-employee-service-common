package ru.fdo.bamk.finrez.employeeservicecommon.coreapi.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class ChangeOfficeCommand (@TargetAggregateIdentifier val employeeId: String,
                                val officeId: String)