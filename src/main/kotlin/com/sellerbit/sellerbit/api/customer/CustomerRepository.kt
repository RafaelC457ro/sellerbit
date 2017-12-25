package com.sellerbit.sellerbit.api.customer

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long>