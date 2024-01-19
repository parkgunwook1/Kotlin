
fun main() {
    println("Hello.println() Kotlin!!");

    /* 코틀린 변수 선언 기본 형태
    *
    *   var/val 변수명 : 변수타입 = 초기화
    *   ex) var name: String = "name"
    *
    *   자바는
    *   String name = "name";
    * */

    // var / val 키워드

    var name: String = "name" // 읽기/쓰기가 가능한 일반 변수
    val age: Int = 100        // 읽기만 가능한 final 변수

    // var로 선언하면 변수의 값을 변경할 수 있다. 이러한 변수를 가변 변수라고 부른다.
    // 반대로 val을 선언한 변수는 값을 변경할 수 없고 불변 변수라고 부른다.



    var address:String = "seoul"
    val Memno:Int = 111
    println("name=$address")

    address = "swoun"
//    Memno = 1     => 불변변수라 값 변경 안된다.
    println(address)

    /* Non-Null / Nullable
    *   코틀린에서는 Non-null 타입과 Nullable 타입이 존재한다.
    *   null을 값으로 가질 수 있으면 Nullable,null 값으로 가질 수 없으면 Non-null 타입이다.
    * */


    /*
    *  코틀린은 정적 타입 언어로, 변수 또는 표현식의 자료형을 명시적으로 선언하지 않아도 자동으로 유추할 수 있다.
    * */
    val phone = 1 // 자료형 자동 유추 가능하다.
    println(phone)

    var empty:String? = null  // null 타입으로 선언하기 위해 물음표 사용
    println(empty)
    empty = "ABC"
    print(empty?.length) // ?는 null check를 해주고, 기본적으로 null check 해주는것이 좋다.
}