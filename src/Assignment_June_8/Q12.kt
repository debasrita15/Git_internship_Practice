package Assignment_June_8

fun main()
{
    val num: Int? = 10
    val conversion = num?.let {"The value is $it"} ?: "Value is missing"
    println(conversion)  //Convert a nullable integer into string
}