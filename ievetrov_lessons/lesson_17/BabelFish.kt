package ievetrov_lessons.lesson_17

class BabelFish(
    private val coefficient: Int?
) {

    var isTranslated = false

    var nerveSignalLevel = 200
//        get() = field //field передает то поле для которого мы явно прописываем get
//        get() = 250 //то передаст в экземпляр 250 вместо 200
        get() = if (coefficient != null) field * coefficient else field
        set(value: Int) { //set вызывается при записи в переменную класса нового значения
            field = value //Ключевого слова value нет. В сеттере для нового значения можно использовать любое название переменной.
            if (value > 300){
                isTranslated = true
                println("isTranslated = true")
            }
        }
}