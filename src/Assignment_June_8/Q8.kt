package Assignment_June_8

fun main()
{
    val firstname = "Debasrita"
    val lastname = "Das"
    val formattedname = fullname(firstname,lastname)
    println("Formatted name:$formattedname")
}
fun fullname(firstname: String ="",lastname: String =""): String
{
    return "$firstname $lastname".trim()  // Formatted Full name
}