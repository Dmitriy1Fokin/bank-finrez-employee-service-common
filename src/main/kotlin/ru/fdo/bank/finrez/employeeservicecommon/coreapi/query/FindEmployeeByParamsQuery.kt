package ru.fdo.bank.finrez.employeeservicecommon.coreapi.query

import org.springframework.data.domain.Pageable

data class FindEmployeeByParamsQuery(val searchParameters: Map<String, String>, val pageable: Pageable)