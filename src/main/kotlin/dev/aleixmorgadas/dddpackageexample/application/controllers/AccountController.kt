package dev.aleixmorgadas.dddpackageexample.application.controllers

import dev.aleixmorgadas.dddpackageexample.domain.account.AccountID
import dev.aleixmorgadas.dddpackageexample.domain.account.AccountService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/account")
class AccountController(
    private val accountService: AccountService,
) {

    @GetMapping("/{id}")
    fun accountById(@PathVariable id: AccountID): ResponseEntity<AccountDTO> {
        val account = accountService.findById(id).orElseThrow { NotFoundException() }
        return ResponseEntity.ok(AccountDTO(name = account.name))
    }
}