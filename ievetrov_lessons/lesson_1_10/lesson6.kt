//Циклы в Kotlin. while, do-while
package ievetrov_lessons.lesson_1_10

fun main() {
    // while, do while
    var counter = 5
//    while (counter > 0){
//        println("Реклама закончится через ${counter--}")
//        Thread.sleep(1000)
//    }

    do{
       println("Реклама закончится через ${counter--}")
       Thread.sleep(1000)
    } while(counter > 0)
}