package `class`/*
*   코틀린 언어는 자바의 static 키워드를 지원하지 않는다.
*   그 대신 패키지 수준의 최상위 함수와 객체를 선언을 통해 static 메서드 역할을 대신한다.
*
*   생성자를 생략해줘도, 자동으로 기본생성자가 생성된다.
* */
// 코틀린의 클래스는 기본 가시성이 public 이다.

class Person (var name: String = "개발자" , var age: Int = 20) {
    //constructor  { // 생성자는 constructor 라는 키워드를 통해 선언할 수 있다.
        // 이 키워드를 통해 name, age 프로퍼티를 초기화 하는 생성자를 구현할 수 있다.
//        this.name = name
//        this.age = age
//    }



    // 코틀린의 프로퍼티는 선언과 동시에 초기화를 해줘야한다.
    companion object { // companion object(동반객체)를 통해 클래스 안의 private 멤버에 접근할 수 있는 static 메서드 선언

        fun main(args: Array<String>) {

            val person1 = Person("Park", 10) // 객체 생성
            val person2 = Person("Kim", 20) // 객체 생성
            val person3 = Person()
            val person4 = Person("you")

            println(person1)
            println(person2)
            println(person3)
            println(person4)
        }
    }
}