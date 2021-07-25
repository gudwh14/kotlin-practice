package com.example.kotlin_practice.grammar

// 엔트리 함수 ( 맨 처음 실행되는 함수)
fun main() {
    hello();
    // String Template
    val name = "jjo"
    val lastName = "Cha"
    println("name is ${name + lastName}");
    println("is that True ? ${1==0}");
    println("this is 2\$. ^^");


}

// 함수 리턴 값이 없을 경우 Unit
// 리턴 값이 없으면 리턴타입 생략 가능하다
fun hello() : Unit {
    println("Hello world");
}

// 리턴타입이 존재 할경우 반드시 리턴타입을 기재 해줘야한다.
fun add(a : Int, b : Int) : Int {
    return a+b;
}

// val vs var
// (val)ue : 상수 (변하지 않는 값)
// (var)iable : 변수
fun example() {
    val a : Int = 10;
    var b : Int = 10;

//  a = 5; 재할당 불가
    b = 15;

    val c = 10 ; // 자동 타입추론이 가능해서 int 형으로 인식함
    var name : String = "jjo";
}