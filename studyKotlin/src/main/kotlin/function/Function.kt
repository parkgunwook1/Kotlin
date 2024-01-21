package function

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}
fun min(a: Int, b: Int): Int = if (a > b) a else b // 함수를 {} 괄호와 retrun 생략가능. 반환형은 써줘야함.