package ru.fdo.bank.finrez.employeeservicecommon.coreapi.query

import org.springframework.data.domain.Pageable

data class FindAllEmployeesByOfficesQuery(val officeIds: List<String>, val pageable: Pageable)