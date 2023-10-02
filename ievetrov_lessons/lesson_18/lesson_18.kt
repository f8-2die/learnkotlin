package ievetrov_lessons.lesson_18

import java.util.*

//ООП. Полиморфизм, 3 типа (Ad hoc, Subtyping, Parametric)
fun main(){

    //ad hoc (по случаю)
    //subtyping (полиморфизм включения)
    //Parametric (параметрический)

    val creationDate = Date()
    val note = NotesAppItem()

    // мы могли оставить ...messageItem: MessageItem...
    //родитель может содержать ссылку на свой дочерний класс и может вызывать метод
    //своего дочернего класса который переопределен и является общим в обоих классах
    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate",
    )
    println()

    val phoneItem: NotesAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        8_800_555_35_35,
    )
    println()

    val listItem: NotesAppItem = ListItem(
        "todolist",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes" ),
    )

//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())

    var arrayOfNotes = arrayOf<NotesAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)
}

fun showAllNotes(notes: Array<NotesAppItem>){
    notes.forEach {
        println(it.getItemData())
    }
}