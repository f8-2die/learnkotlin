package ievetrov_lessons.lesson_1_10

fun main() {
    // Коллекции: списки (List)

    // List
    // Set
    // Map

    // отличия от массива:
    // у массива фиксированный размер
    // Array<T>, List<T>
    // Массивы оптимизированы для примитивов
    // отличается процесс сравнивания элементов

    val list: List<Int> = listOf(4, 4, 2)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3) //лист с возможность добавления и удаления элементов

    val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
//    println(mutableList)

    mutableList.add(42) // Добавит в конец

    mutableList.add(0, 42) // сначала индекс, потом число

//    println(mutableList.contains(42)) // возвращает true, проверка на наличие этого числа

//    println(mutableList.isEmpty()) // возвращают true или false
//    println(mutableList.isNotEmpty())

//    println(mutableList.indexOf(42)) // возвращает индекс первого, если их несколько
//    println(mutableList.lastIndexOf(42)) // возвращает индекс последнего такого числа

    mutableList.sort() //сортирует по возрастанию
    mutableList.sortDescending() //  по убыванию
    mutableList.reverse() // изменяет порядок элементов в списке на обратный

    mutableList.forEach(){ //будут происходить действия при прохождении каждого элемента списка
        println(it) // it - автоматически задекларированная переменная, тип данных основан на элементах списка
    }

    // интервал -> for
    // коллекция -> forEach
    // break, continue -> for

    // отфильтрованный список, каждый элемент проверяется на равенство 42 и если верно то элемент запишется в новый список
    val mutableList2 = mutableList.filter {
        it == 42
    }
    mutableList2.forEach{ println(it)}

    // обходим все эллементы списка и записываем их преобразования в новый, и выводим в консоль
    val mutableList3 = mutableList2.map{
        it * 2
    }
    mutableList3.forEach{println(it)}


}