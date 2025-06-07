package Assignment_June_7

fun main()
{
    for (i in 1..10)
    {
        if(i % 4 == 0)
        {
            println("Skip decaf order $i")  //Skip printing decaf
            continue
        }
    }
}