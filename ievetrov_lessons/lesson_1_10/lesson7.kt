//Цикл for в Kotlin, диапазоны (интервалы)
package ievetrov_lessons.lesson_1_10

fun main() {

    // диапазоны (интервалы) Range

    val range1 = 42..442 //с помощью двух точек ..
    val range2 = 42 until 442 // не включает последнее значение
    val range3: LongRange = 42L..442L // можно без LongRange
    val range4: CharRange = 'a'..'z' // можно без CharRange и тд.
    val range5: ClosedRange<Double> = 42.1..442.1
    val range6 = 42.1f..442.1f
    val range7: IntProgression = 42..442 step 2 //прогрессия с шагом 2
    val range8: IntProgression = 442 downTo 42 step 2 // убывающая прогрессия с шагом 2

    // in, !in
    
    val a = 52 in range1
    val b = 52 !in range1
//    println(a)
//    println(b)

    // for (лучше юзать, когда известно кол-во итераций, в другом случае while)
    // break, continue, return

    for (i in 5 downTo 1){
        if(i == 3){
//            println("Пользователь нажал кнопку \"Пропустить\"")
//            break //выходит из цикла
//            println("i == 3, i не будет распечатана")
//            continue //пропускает операции при конкретном значении, но не заканчивает цикл
            return //программа завершит свое выполнение
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }

//    for(i in range2 step 8){
//        println(i)
//    }


}