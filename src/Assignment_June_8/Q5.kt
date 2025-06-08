package Assignment_June_8

fun main()
{
    val nums = (1..5).toList()
    val square = mutableListOf<Int>()
    for(n in nums)
        square.add(n*n)       //Square of nos.
    print("Squares of nums:")
    println(square)
}