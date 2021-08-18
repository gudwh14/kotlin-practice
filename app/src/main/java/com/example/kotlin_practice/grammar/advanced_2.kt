package com.example.kotlin_practice.grammar

// toString(), hashCode(), equals(), copy() 메소드를 가지고 있다.
data class Ticket(val companyName : String, val name : String, var data : String, var seatNumber : Int)
class TicketNormal(val companyName : String, val name : String, var data : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("KoreanAir", "jjo", "2020-12-25", 15)
    val ticketB = TicketNormal("KoreanAir", "jjo", "2020-12-25", 15)

    println(ticketA)
    println(ticketB)
}