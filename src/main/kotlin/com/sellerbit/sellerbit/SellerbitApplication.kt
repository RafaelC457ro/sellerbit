package com.sellerbit.sellerbit

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SellerbitApplication

fun main(args: Array<String>) {
    SpringApplication.run(SellerbitApplication::class.java, *args)
}
