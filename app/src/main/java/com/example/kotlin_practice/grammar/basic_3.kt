package com.example.kotlin_practice.grammar

fun main() {
    nullCheck();
}

// Nullable, NonNull
fun nullCheck() {
    var name : String = "jjo";
    var nullName : String? = null; // nullable type

    var nameUpperCase = name.uppercase();
    var nullNameUpperCase = nullName?.uppercase(); // null 이면 null 반환 , 아니면 uppercase() 실행

    // ?: 연산자 null 이면 default 값을 반환해준다.
    var lastName : String? = null;
    val fullName = name +" "+(lastName?: "No LastName");
    println("fullName : ${fullName}");

    // !! nullable 이지만 null 아니라는걸 보장 확실하지 않으면 쓰지않는걸 권장
}

fun ignoreNulls(str : String?) {
    val notNull : String = str!!

    val email : String? = "alxious@naver.com";
    // let null 이 아니면 실행해라
    email?.let {
        println("email ${it}");
    }
}