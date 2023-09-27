package ievetrov_lessons.lesson_11_12
//в круглых скобках обозначили свойства класса
class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {

    fun addToFavorites(){
        println("Блюдо $name добавлено в избранное")
        inFavorites = true
    }

    fun removeFromFavorites(){
        println("Блюдо $name удалено из избранного")
        inFavorites = false
    }

    fun startCooking(){
        println("Пользователь перешел на экран начала готовки блюда $name")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }


}