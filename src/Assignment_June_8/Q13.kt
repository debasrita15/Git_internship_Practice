package Assignment_June_8

fun main()
{
    val num: String? ="123"
    val product = num?.toIntOrNull()?.let {it*2}   //Multiply it by 2
    println("Product:$product")
}