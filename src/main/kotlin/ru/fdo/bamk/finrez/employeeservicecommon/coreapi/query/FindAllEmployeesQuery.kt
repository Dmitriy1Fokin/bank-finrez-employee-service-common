package ru.fdo.bamk.finrez.employeeservicecommon.coreapi.query

import org.springframework.data.domain.Pageable

data class FindAllEmployeesQuery(val pageable: Pageable)