package ievetrov_lessons.lesson_1_10

fun main(){
    // логические операторы
    // операторы сравнения
//    val a = 1 + 1
//    val b = 1 == 1

//    println("$a, $b")
    // <, >, >=, <=, ==, !=
    // true и false

//    println(0 < -1) //false
//    println(1 == 1) // true

    // ===, !== (операторы ссылочного сравнения)

    // &&, ||, ! (логические операторы И, ИЛИ, НЕ)
    val userAge = 42
//    var comparisonResult = (userAge >= AGE_OF_MAJORITY) && (userAge <= RETIREMENT_AGE) // можно без скобок, но с ними лучше
    val comparisonResult = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE // можно все сделать короче просто поставив in и точки
    println("Результат проверки возраста: $comparisonResult")

    val a = true
    val b = !a
//    println(b) //false



}

//const val AGE_OF_MAJORITY = 18 // константы нельзя объявлять локально и принято писать заглавными с нижним подчеркиванием
const val RETIREMENT_AGE = 65




