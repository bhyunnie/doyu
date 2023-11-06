package com.doyu.kr

import jakarta.persistence.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.Transactional

@SpringBootApplication
class DoyuApplication

fun main(args: Array<String>) {
    runApplication<DoyuApplication>(*args)
}

@Transactional
class Service

@Entity
@Table
class Person (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Long?,

        @Column
        var name : String?,

        @Column
        var age: Int
)