//Арифметические операции в языке Kotlin
package ievetrov_lessons.lesson_1_10

fun main(){
    val intNum1: Int = 5
    val intNum2: Int = 7
//    val sum = a + b

//    val c: Int
//    println(a+b)
//    println(sum)
//    println(10/3) выведет целое число
    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    val floatNum1:Float = 10f
    val floatNum2:Float = 3f

//    println(num1/num2) // 3.3333333333333335
//    println(num3/num4) // 3.3333333

    // остаток от деления %
//    println(10 % 3) //1

    //конечный тип переменной
    val c = intNum1 + floatNum1
//    println(c) // 15.0 т.е флоат
//  println(c::class) //чтобы узнать тип переменной

    val d = intNum2 + doubleNum2 + floatNum1
    println(d)// 20.0 double

    // инкремент, декремент

    var counter = 0

    counter = counter + 1
    counter += 1
    counter++

//    println(counter)

    counter -= 1
    counter--

    ++counter
    --counter

    // операторы сравнения true false
    val a = 5
    val b = 7
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)


}