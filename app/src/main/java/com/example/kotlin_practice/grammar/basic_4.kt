package com.example.kotlin_practice.grammar


// open 예약어를 통해 상속 가능하다.
open class Human(val name : String = "default") {

    init { // 주 생성자
        println("Human class Create Success");
    }

    constructor(name : String,age : Int) : this(name) { // 부 생성자
        println("name : ${name}, age : ${age}");
    }

    open fun eat() {
        println("eat()");
    }
}

class Korean : Human() {
    // 메소드를 오버라이드 하기 위해 override
    override fun eat() {
        println("korean eat()");
    }
}

fun main() {
    val human = Human("jjo");
    human.eat();

    val stranger = Human();
    println("stranger name : ${stranger.name}");

    val man = Human("Mike",30);

    val korean = Korean();
    korean.eat();
}