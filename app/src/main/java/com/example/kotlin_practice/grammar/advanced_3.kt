package com.example.kotlin_practice.grammar

// Companion Object
// Java 의 Static 대신 사용 정적변수, 정적메소드를 만들때 사용

class Book private constructor(val id : Int, val name : String) {

    // interface 상속가능
    companion object BookFactory : IdProvider{
        val myBook = "my Book"
        fun create() = Book(getId(), myBook)

        override fun getId(): Int {
            return 12;
        }
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main () {
    // Object.Companion .Companion 은 생략가능
    val book = Book.BookFactory.create()
    println("${book.id} ${book.name}")
}