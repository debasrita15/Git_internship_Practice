package Assignment_June_10

fun main()
{
    val num: Any = 30
    val age: Int? = num as? Int     //Safecasting of Int from Any type
    println(age)
}