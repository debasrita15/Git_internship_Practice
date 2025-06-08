package Assignment_June_8

fun main()
{
    val str: String? ="Apple"
    println("Using !!: ${str!!.length}")
    println("Using ?.: ${str?.length}")
    println("Using ?: : ${str?: "Missing"}")
}