package ievetrov_lessons.lesson_11

fun main(){
    val dish1: Dish = Dish( //: Dish ставить необязательно, это тип переменной, в данном случае это класс диш
        id = 1,
        name = "Яичница",
        category = "Завтраки",
        ingredients = listOf("яйцо", "помидор", "соль", "перец"),
    )
    val dish2 = Dish(
        id = 2,
        name = "Суп лапша",
        category = "Обеды",
        ingredients = listOf("вода", "курица", "лапша", "соль","перец"),
    )
//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish1.inFavorites)
//    println()
//    println(dish2.name)
//    println(dish2.ingredients)
//    println(dish2.inFavorites)

//    dish1.category = "Блюда из яиц"
//    dish2.inFavorites = true
//    println(dish1.category)
//    println(dish2.inFavorites)

    println("Действия для блюда яичница")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()

    println()

    println("Действия для блюда суп лапша")
    dish2.addToFavorites()
    println(dish2.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)






}