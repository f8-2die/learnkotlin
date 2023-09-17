package ievetrov_lessons.lesson_1_10

fun main() {
    val userAge = readLine()!!.toInt()

//    if (userAge < AGE_OF_MAJORITY){
//        println("Открыть мультики")
//    } else if(userAge == 16 || userAge == 17){
//        println("показать ограниченный контент")
//    }
//    else
//        println("Показать скрытый контент")

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать скрытый контент"
    else if (userAge == 16 || userAge == 17) "показать ограниченный контент"
    else "Открыть мультики"

//    println(resultText)

    // when

//    when(userAge){
//        10 -> println("Ввели число 10")
//        20 -> println("Ввели число 20")
//        42 -> println("Ввели число 42")
//        else -> println("Ввели другое число")
//    }
    val consoleNum = when(userAge){
        10 -> {
            println("Дополнительное дейтствие, если ввели 10")
            "Ввели число 10"
        }
        20 -> "Ввели число 20"
        42 -> "Ввели число 42"
        else -> "Ввели другое число"
    }
    println(consoleNum)
}

const val AGE_OF_MAJORITY = 18
