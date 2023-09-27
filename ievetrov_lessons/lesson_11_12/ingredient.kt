package ievetrov_lessons.lesson_11_12

//class Ingredient(_name: String, _weight: Int, _count: Int){ // если в круглых скобках пусто, то это первичный конструктор //Ingredient()//
//    var name = _name
//    var weight = _weight
//    var count = _count
// }
//можно сделать это короче
class Ingredient(var name: String, var weight: Int, var count: Int){

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count){ //вызов конструктора

        //ниже написали this, оно показывает что это переменная класса (строчка 11)
        this.isNeedToPrepare = isNeedToPrepare //сначала обращаемся к переменной из тела класса, затем присваиваем из конструктора

    }

    // когда при создании объекта нужно выполнить блок кода, то:

    init {
        println("ингридиент $name создан")
    }

    // очередность вызовов блоков кода:

    // вторичный конструктор
    // превичный конструктор
    // блоки init
    // тело вторичного конструктора
}

