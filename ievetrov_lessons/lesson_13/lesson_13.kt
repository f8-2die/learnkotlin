//Null Safety – операторы ?. !!, NullPointerException (NPE)
package ievetrov_lessons.lesson_13
fun main(){

    // NullPointerException (NPE)
    // null
    val nullableString: String? = null

//    if (nullableString != null) println(nullableString.length)
//    else println("переменная равна null")
    // почти тоже самое
//    println(nullableString?.length)

//    val nullableLine: String? = readLine()

    // ?:0 если переменная равна нулю, то ей дают правое значение
    // ?:999 значит тут дадут ей значение 999
    val stringLength: Int = nullableString?.length ?:0
    // ? может равняться нулю
    // !! не будет нулевым
}