package com.sellerbit.sellerbit.api.customer

import javax.persistence.*

@Entity
@Table(name="customers")
data class Customer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1,
    var name: String = "",
    var lastname: String = ""
)