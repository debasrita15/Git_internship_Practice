package Assignment_June_7

fun main()
{
    val tempinC = 55
    when   // Coffee temp
    {
        tempinC < 50 -> println("Too cold!")
        tempinC in 50..70 -> println("Perfect!")
        else -> println("Too hot")
    }
}