package com.example.kotlin_practice.grammar

import kotlin.math.ln

fun main() {
    checkNum(90)
    forAndWhile();
}

// 조건식 if
fun maxBy(a : Int, b : Int) : Int {
    if(a > b) {
        return a;
    }
    else {
        return b;
    }
}

// 위 함수와 동일하다 삼항연산자 대신 사용한다.
fun maxBy2(a: Int , b : Int ) : Int =  if(a>b) a else b;

fun checkNum(score : Int) : Unit{
    // switch
    when(score) {
        0 -> println("this is 0");
        1 -> println("this is 1");
        2,3 -> println("this is 2 or 3");
        else -> println("else score");
    }

    // 표현식으로 사용하려면 else 를 필수로 사용해야함
    var scoreWhen = when(score) {
        1 -> 1;
        2 -> 2;
        else -> 3;
    }

    println("scoreWhen : ${scoreWhen}");

    when(score) {
        in 90..100 -> println("GOOD!!")
        in 80..90 -> println("Nice")
        else -> println("Not bad")
    }
}

// Expression vs Statement
// 코틀린의 모든 함수는 Expression

// Array vs List
fun array() {
    val array = arrayOf(1,2,3);
    val list = listOf<Int>(1,2,3); // List
    val arrayList = arrayListOf<Int>(0,1,2) // Mutable List

    array[0] = 3;
    // list[0] = 2; 불가
    arrayList.add(1);
    arrayList[1] = 0;
}

fun forAndWhile() : Unit {
    val students = arrayListOf<String>("Mike","John","Bob");
    // for 문
    for(name in students) {
        println("name : ${name}");
    }
    for((index,name) in students.withIndex()) {
        println("${index+1}번째 학생 name : ${name}");
    }


    for(index in 1..10 step 2) {
        println("index : ${index}");
    }
    for(index in 10 downTo 1) { // 10 ~ 1 까지 내려온다.
        println("index : ${index}");
    }
    for(index in 1 until 10) { // 10을 포함하지 않는다.
        println("index : ${index}");
    }

    var index = 0;
    while (index <= 10) {
        println("while index : ${index}");
        index++
    }
}
