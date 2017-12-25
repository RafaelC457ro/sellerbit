package com.sellerbit.sellerbit.api.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RequestMapping("/customer")
@RestController
class GreetingController {
    @Autowired
    lateinit var repository: CustomerRepository

    @PostMapping
    fun create(@RequestBody customer: Customer): Customer {

        return repository.save(customer)
    }

    @GetMapping("/{id}")
    fun find(@PathVariable("id") id: Long): Customer {
        val customer = repository.findOne(id)

        return customer
    }

    @GetMapping
    fun list(): List<Customer> {
        return repository.findAll().toList()
    }

    @PutMapping("/{id}")
    fun update(
            @PathVariable("id") id: Long,
            @RequestBody updatedCustomer: Customer
    ): Customer? {
        if(!repository.exists(id))
            return null

        repository.save(updatedCustomer)
        return updatedCustomer
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) {
        if(repository.exists(id))
            repository.delete(id)
    }
}