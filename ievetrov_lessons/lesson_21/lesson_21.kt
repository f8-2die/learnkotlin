package ievetrov_lessons.lesson_21
//Extensions (функции-расширения, экстеншены)
import java.io.File

//это нужно, чтобы расширять функционал классов, к которым у нас нет доступа

//экстеншен свойства (в данном случае нужно явно указать геттер и сеттер)
val File.nameWithoutExtension: String
    get() = name.substringBeforeLast(".")



fun main(){


    val file = File("textFile.txt")
    file.writeToFileAndSend()

    println(file.nameWithoutExtension)

}

fun File.writeToFileAndSend(){

    val message = "some message for file"
    createNewFile()
    writeText(message)
    println("message: \"$message\" added to file $name and send")

}