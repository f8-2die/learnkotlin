package ievetrov_lessons.lesson_1_10    //Функции (методы), тип возвращаемого значения, return
fun main() {

    val name = getName() //запускает функцию, после ее выполнения возвращается в мэйн
    val age = getAge() //вначале пишем val age, потому что метод (getAge) возвращает значение
// но могли и просто оставить запуск функции через  getAge()   (без переменных вначале)

    printNameAndAge(name, age)

    // можно использовать именнованные аргументы
// printNameAndAge(userName = name, userAge = age) // первое - как в мэйн, второе - как в следующем методе
// а можно и еще короче:
// printNameAndAge(userName = getName(), userAge = getAge())
}
//чтобы вернуть значение после ф-ции укажем тип, например : Int (? = может быть пустым)
fun getName() : String? {
    println("Введите имя:")
    val name = readLine()
    println(name)
    return name //возвращает в место, где вызвали, т.е мэйн
    // но область видимости обычной переменной, например тут name, в пределах одного метода, тут getName
}

// МОЖНО СДЕЛАТЬ КОРОЧЕ:
// fun getName() : String? = readLine()
// fun getAge() : Int? = readLine()


fun getAge() : Int? {
    println("Введите возраст:")
    return readLine()?.toInt() // то же, что и выше (почти)
}

// метод, который будет принимать имя и возраст
// то, что приходит извне мы обозначаем в сигнатуре(в скобках), т.е name: String?
// переменные в круглых скобках это контейнеры, куда приходят значения, а пользоваться ими
// можно только в теле, применяя одноименные переменные
fun printNameAndAge(name: String?, age: Int?){
    println("Данные пользователя: $name, $age")

}

