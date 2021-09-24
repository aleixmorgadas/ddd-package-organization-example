package dev.aleixmorgadas.dddpackageexample.application.controllers

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value=HttpStatus.NOT_FOUND)
class NotFoundException: Exception() {
}