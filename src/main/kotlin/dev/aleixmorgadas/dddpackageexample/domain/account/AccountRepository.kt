package dev.aleixmorgadas.dddpackageexample.domain.account

import java.util.*

interface AccountRepository {
    fun findById(accountId: AccountID): Optional<Account>
}