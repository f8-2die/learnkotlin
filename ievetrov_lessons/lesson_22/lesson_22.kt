package ievetrov_lessons.lesson_22
//Data class (дата классы) copy, toString, equals, hashCode

fun main() {

    // class vs data class
    // equals() - сравнение двух объектов
    // hashCode() - уникальный код объекта
    // toString() - строковое представление
    // copy() - копирование объекта

    val word1 = Word("Red", "Красный")
    val word2 = Word("Red", "Красный")
    val word3 = Word("white", "Белый")
//    println(word1.equals(word2)) //можно так
//    println(word2 == word3) // а можно так
//
//    //если бы не было data class то сравнивались бы ссылки, а не значения
//
//    var word4 = word3.copy() // просто скопирует
//    println(word4)
//    word4 = word3.copy(translate = "Правильный перевод: Белый") // изменит 1 поле и тоже работает только с data class
//    println(word4)

    println(word1.hashCode()) // если с дата классом, то будет один для разных объектов
    println(word2.hashCode())// если без дата класса, то будет разный

}
//Можно сделать как ниже:

//class Word(
//    val text: String,
//    val translate: String,
//){ // alt + insert автоматически генерирует туСтринг
//    override fun toString(): String {
//        return "Word(text='$text', translate='$translate')"
//    }
//}

//а можно сделать так:

data class Word(
    val text: String,
    val translate: String,
)