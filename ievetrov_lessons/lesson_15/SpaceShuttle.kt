package ievetrov_lessons.lesson_15

abstract class SpaceShuttle : Movable, Shootable { //Добавляем реализацию интерфейсов
    abstract val tankSize: Int
    abstract fun runDiagnostic()
}
//суть абстрактного класа в том, что не создаем экземпляры, а только наследуем

class Upsilon(override val tankSize: Int) : SpaceShuttle(){
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeoff() {
        println("Развернуть крылья")
    }

    override fun prepareForLanding() {
        println("Свернуть крылья")
    }

    override fun startShooting() {
        println("Начать стрельбу")
    }

    override fun reloadGuns() {
        println("Перезарядить орудия")
    }
}