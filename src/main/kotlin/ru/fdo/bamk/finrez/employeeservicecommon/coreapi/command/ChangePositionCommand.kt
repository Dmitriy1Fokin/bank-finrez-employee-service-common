package ru.fdo.bamk.finrez.employeeservicecommon.coreapi.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class ChangePositionCommand (@TargetAggregateIdentifier val employeeId: String,
                                  val position: String)