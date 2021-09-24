package dev.aleixmorgadas.dddpackageexample.infrastructure.account

import dev.aleixmorgadas.dddpackageexample.domain.account.Account
import dev.aleixmorgadas.dddpackageexample.domain.account.AccountID
import dev.aleixmorgadas.dddpackageexample.domain.account.AccountRepository
import org.springframework.data.repository.CrudRepository

interface AccountJPARepository: CrudRepository<Account, AccountID>, AccountRepository {
}