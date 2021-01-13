package ru.fdo.bank.finrez.employeeservicecommon.coreapi.event

data class OfficeChangedEvent(val employeeId: String,
                              val officeId: String)