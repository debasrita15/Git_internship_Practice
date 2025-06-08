package Assignment_June_8

fun main()
{
    val num = (1..10).toList()
    val evenno = mutableSetOf<Int>()
    for(num in num)
    {
        if(num % 2 == 0)
            evenno.add(num)          //Filter even nos.
    }
    print("Set of even nos between 1 and 10:")
    println(evenno)
}