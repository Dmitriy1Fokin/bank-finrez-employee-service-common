package ru.fdo.bank.finrez.employeeservicecommon.coreapi.event

data class PositionChangedEvent(val employeeId: String,
                                val position: String)