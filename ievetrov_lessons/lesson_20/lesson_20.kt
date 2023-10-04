package ievetrov_lessons.lesson_20

import java.util.Calendar

// Лямбда-функции (лямбды), анонимные функции

fun main(){

    // анонимные функции
    // лямбды

    val calendar: Calendar = Calendar.getInstance()

    //сохраняем не значение, а сам метод
    val getDaysToEndYear = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    //можно было вызвать с помощью getDaysToEndYear.invoke(), а можно просто скобками
    println(getDaysToEndYear())

    val convertEndDaysToMills = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    convertEndDaysToMills(getDaysToEndYear())

//лямбды можно считать за анонимные функции, у которых нет названий, разница между анонимными функциями и лямбдами:
//анонимы без названия заключаются с помощью ключевого слова fun, а лямбды с помощью заключения кода в фигурные скобки

    val printStringWithLambda: (Int)-> String

    printStringWithLambda = { answer: Int -> // тут  it: Int заменили на answer: Int
        "print string with lambda $answer"
    }

    println(printStringWithLambda(42)); // ставим ; чтобы разделить функцию (иначе она будет считать, что строки ниже относятся к ней

    //короткая запись
    println({ it: Int -> "print string with lambda 2 $it"}(442))


    //конвертация дней в милисекунды
    val convertLambda = { endDays: Int ->
        println("Convert from lambda ${1000 * 60 * 60 * 24 * endDays}")
    }

    convertLambda(getDaysToEndYear())


}

