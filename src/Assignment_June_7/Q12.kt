package Assignment_June_7

fun main()
{
    val cofPrice = 90
    when(cofPrice)     // Fun message for price
    {
        in 10..30 -> println("Low price...Wonderful deal!")
        in 31..60 -> println("Medium price...Not a bad deal though!")
        else -> println("High price... Good vibes only")
    }

}