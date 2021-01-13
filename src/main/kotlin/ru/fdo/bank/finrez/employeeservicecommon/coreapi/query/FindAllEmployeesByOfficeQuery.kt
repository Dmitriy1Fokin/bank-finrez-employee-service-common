package ru.fdo.bank.finrez.employeeservicecommon.coreapi.query

import org.springframework.data.domain.Pageable

data class FindAllEmployeesByOfficeQuery(val officeId: String, val pageable: Pageable)