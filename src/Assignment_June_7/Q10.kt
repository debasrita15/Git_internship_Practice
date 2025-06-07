package Assignment_June_7

fun main()
{
    val caff = 65
    when  //Coffee strength based on caffeine level
    {
        caff <= 30 -> println("Mild caffeine")
        caff <= 70 -> println("Medium caffeine")
        else -> println("Strong Caffeine")
    }
}