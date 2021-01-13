package ru.fdo.bamk.finrez.employeeservicecommon.coreapi.event

data class OfficeChangedEvent(val employeeId: String,
                              val officeId: String)