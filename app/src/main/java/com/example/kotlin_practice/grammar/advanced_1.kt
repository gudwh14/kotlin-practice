package com.example.kotlin_practice.grammar

// 1.Lambda
// 람다식은 우리가 마치 value 처럼 다를 수 있는 익명 함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수 있다.

// 람다의 기본정의
// val lambdaName : Type = { argumentList -> body }

val square : (Int)-> (Int) = { number ->  number * number}

val nameAge = { name : String,age : Int->
    "My name is ${name} I'm ${age}"
}

fun main() {
    println(square(5));
    println(nameAge("jjo",25));
    val a = "a"
    println(a.pizzaIsGreat());

    println(extendString("jjo", 30))
    println(calculateGrade(97))
    println(calculateGrade(970))

    val lambda = { number : Double ->
        number == 4.23
    }

    println(invokeLambda(lambda))
    println(invokeLambda {it > 3.0} )

    // 람다식이 파라미터의 마지막 값으로 들어가면 () 없이 표현가능
    invokeLambda(lambda)
    invokeLambda(){ it > 3.0 }
}

// 람다의 확장함수
// this -> 함수를 콜한 Object 를 가르킴, it 은 파라미터가 한개일 경우 첫번째 파리미터를 값을 가진다.
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is best";
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {
        "I am ${this} and ${it} years old"
    }
    return name.introduceMyself(age)
}

// 람다의 Return
// 마지막 표현식을 리턴값으로 가진다.
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 방식
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(4.23)
}

// 익명 내부 함수
// 조건
// 1. java interface 이여야 한다.
// 2. 해당 interface 는 한개의 method 만 가져야한다.
