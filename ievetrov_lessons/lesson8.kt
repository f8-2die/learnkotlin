fun main() {
    // Массивы
    val ingredient1 = "" //вместо
    val ingredient2 = ""
    val ingredient3 = "" //этой
    val ingredient4 = ""
    val ingredient5 = "" //шляпы

    val arrayOfIngredients: Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    //массив с указанным типом, например *intArrayOf* может быть пустым (неинициализированным),
    //а без типа, такой как *arrayOf* обязан быть заполненным

    val intArray1: IntArray = intArrayOf(4, 4, 2)
    val charArray1: CharArray = charArrayOf('4','4','2')

//    val intArray2 = arrayOf()
    val intArray3 = intArrayOf(1, 2, 3, 4, 5)

//    println("Размер массива с ингридиентами: ${arrayOfIngredients.size}")

    // индекс это номер эллемента в массиве (начинается с 0)
//    println(arrayOfIngredients.indexOf("помидор")) //выведет 1
//    println(arrayOfIngredients[1]) //помидор
//    println(arrayOfIngredients[2]) //зелень

//    arrayOfIngredients[4] = "паприка"
//    println(arrayOfIngredients[4])

    //устаревший метод set и get
//    arrayOfIngredients.set(1, "капуста") //принимает индекс и значение
//    arrayOfIngredients.get(1) // принимает только индекс

    // Получается, что выводит весь массив
    for(i in arrayOfIngredients){
        println("Ингридиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
}