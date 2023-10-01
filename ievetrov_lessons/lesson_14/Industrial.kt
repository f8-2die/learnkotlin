package ievetrov_lessons.lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : Spaceship(name, speed, unmanned = true){

    fun launchScanningDrones(){
        println("$name: сканирующие дроны запущены")
    }

    // override - показываем, что переназначаем
    override fun runSystemDiagnostic(){
        //super обращение к методам и свойствам суперкласса (родителя)
        super.runSystemDiagnostic()
        println("${name}: запущена диагностика дронов и майнеров")
    }

}