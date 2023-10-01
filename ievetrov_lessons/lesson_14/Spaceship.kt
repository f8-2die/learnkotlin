package ievetrov_lessons.lesson_14

//open делаем для родительского класса, чтобы другие могли наследовать
// abstract class Spaceship - чтобы нельзя было создвать экземпляры класса
open class Spaceship(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
){

    fun switchToWarpMode() {
        println("${name}: Переход в варп-режим")
    }
    //open в данном случае, чтобы можно было переопределить
    open fun runSystemDiagnostic(){
        println("${name}: Запуск диагностики системы корабля")
    }

}