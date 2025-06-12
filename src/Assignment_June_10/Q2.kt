package Assignment_June_10

fun main()
{
    val str: String? = "Apple"
    println(getLength(str))
}
fun getLength(str: String?): Int
{
    return str?.length ?: 0     //Returns the length of the string
}