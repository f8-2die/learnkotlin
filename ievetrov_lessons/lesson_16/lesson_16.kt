package ievetrov_lessons.lesson_16
// ООП. Инкапсуляция. Модификаторы доступа
fun main(){

    //public - по умолчанию. Данные доступны везде
    //private - данные доступны в рамках файла, либо класса
    //protected - данные видны в классе и классах наследниках
    //internal - данные доступны в любой части модуля, где определены

    val guide = HitchhikerGuide()
//    guide.title = "Don't panic"
//    guide.chooseArticle()
    println(guide.getNumberOfPages())
    guide.setNumberOfPages(42_000)
    println(guide.getNumberOfPages())

//    Support().printInfo()
}