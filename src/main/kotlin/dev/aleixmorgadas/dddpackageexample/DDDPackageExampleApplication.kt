package dev.aleixmorgadas.dddpackageexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DDDPackageExampleApplication

fun main(args: Array<String>) {
	runApplication<DDDPackageExampleApplication>(*args)
}
