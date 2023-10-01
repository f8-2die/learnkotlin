package ievetrov_lessons.lesson_15
// Интерфейсы, абстрактные классы. Имплементация.
fun main(){
    val upsilonShuttle = Upsilon(50)

    upsilonShuttle.runDiagnostic()
    upsilonShuttle.prepareForTakeoff()
    upsilonShuttle.prepareForLanding()
    upsilonShuttle.startShooting()
    upsilonShuttle.reloadGuns()

}