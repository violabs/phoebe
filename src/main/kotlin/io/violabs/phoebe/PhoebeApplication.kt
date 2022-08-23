package io.violabs.phoebe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PhoebeApplication

fun main(args: Array<String>) {
  runApplication<PhoebeApplication>(*args)
}
