package Assignment_June_8

fun main()
{
    val list1: List<Int>? = listOf(23,44,12,67)
    val list2: List<Int>? = null
    println(Maxele(list1))
    println(Maxele(list2))
}
fun Maxele(num: List<Int>?): Int
{
    return num?.maxOrNull() ?: -1  //Returns max element and -1 if null
}