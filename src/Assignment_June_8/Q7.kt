package Assignment_June_8

fun main()
{
    val x = 20
    val y = 10
    val z = Sum(x,y)
    println(z)
}
fun Sum(x: Int,y: Int): String
{
    val sum = x+y
    return "Sum of $x and $y = $sum"     //Returns a string message
}