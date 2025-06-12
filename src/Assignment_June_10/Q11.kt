package Assignment_June_10

fun main()
{
    val car = Car()
    car.drive()
}
interface Drivable
{
    fun drive()                //Interface
}
class Car: Drivable
{
    override fun drive()
    {
        println("Driving car")
    }
}