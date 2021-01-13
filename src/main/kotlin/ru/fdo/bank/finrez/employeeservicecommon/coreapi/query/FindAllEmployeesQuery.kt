package ru.fdo.bank.finrez.employeeservicecommon.coreapi.query

import org.springframework.data.domain.Pageable

data class FindAllEmployeesQuery(val pageable: Pageable)