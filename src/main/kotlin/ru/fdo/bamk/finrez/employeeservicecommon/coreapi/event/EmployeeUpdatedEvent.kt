package ru.fdo.bamk.finrez.employeeservicecommon.coreapi.event

data class EmployeeUpdatedEvent(val employeeId: String,
                                val lastName: String,
                                val firstName: String,
                                val middleName: String)