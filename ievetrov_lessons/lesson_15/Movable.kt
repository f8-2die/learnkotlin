package ievetrov_lessons.lesson_15

interface Movable {

    fun startEngine(){
        println("Двигатель запущен")
    }

    //в интерфейсе можно объявить метод без реализации
    // в интерфейсе все методы абстрактные по умолчанию

    fun prepareForTakeoff()
    fun prepareForLanding()


}