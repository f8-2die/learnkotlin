package ievetrov_lessons.lesson_1_10

fun main() {
    //println("Hello World!")

    val num1 = 43
    val num2: Int = 44

    var notificationText = "абоба"

    println(num1)
//    println(notificationText) ctrl+/ быстрый комментарий

    notificationText = "новый текст"
    println(notificationText)
    // целочисленный
    val intNum1: Int = -2147483648//32 bit
    val intNum2: Int = 2147483647//32 bit
    val longNum: Long //64bit
    val shortNum: Short //16bit
    val byteNum: Byte // 8bit
    val unsignedNum: UInt = 214748648u //32bit

    //вещественные ( с плавающей точкой)
    val doubleNum: Double = 234.42 //64bit
    val floatNum: Float = 847.2f //32bit

    //Строковые
    val stringValue: String = "букавы в двойных ковычках"
    val charValue:Char = '1' //ток 1 символ

    // логические
    val BooleanValue: Boolean = true //false


}