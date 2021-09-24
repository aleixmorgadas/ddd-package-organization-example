package dev.aleixmorgadas.dddpackageexample.domain.account

import org.springframework.stereotype.Service

@Service
class AccountService(
    private val accountRepository: AccountRepository
) {
    fun findById(accountId: AccountID) = accountRepository.findById(accountId)
}