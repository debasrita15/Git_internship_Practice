package Assignment_June_10

fun main()
{
    val c =Circle(4.5)
    println("Area of circle: ${c.area()}")
}
abstract class Shape
{
    abstract fun area(): Double    //Abstract class
}
class Circle(private val rad: Double): Shape()
{
    override fun area(): Double = 3.141*rad*rad    //Inheritance
}