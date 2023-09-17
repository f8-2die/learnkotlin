package ievetrov_lessons.lesson_1_10

fun main(){
    // конкатенация строк (сложение)
    val hello = "Привет"
    val space = ' '
    val userName = "Максим"
//    println(hello + ", " + userName + "!" + space + "Как дела?")

    //интерполяция строк

//    println("$hello, $userName! Как твои дела?")
//    println("фича 5 + 7 = ${5 + 7}")

    // многострочный текст
    val multiString = """
            строка 1
        строка 2
          строка 3
    """.trimIndent() // появляется автоматически, ищет общий(минимальный) отступ и удаляет его из строки
    println(multiString)

    val multiString2 = """
            |строка 1
        |строка 2
          |строка 3
    """.trimMargin() //выравнивает все строчки к началу
    println(multiString2)
}