package Assignment_June_8

fun main()
{
    val num = 5
    val fact = factorial(num)
    println("Factorial of $num = $fact")
}
fun factorial(num:Int): Int
{
    var fact1 = 1
    if(num <= 1)
        return 1
    else
    {
        for(n in 1..num)
            fact1=fact1*n       //Factorial of a no
        return fact1
    }
}