package Assignment_June_8

fun main()
{
    val nums =(1..10).toList()
    val sum = sumofoddnos(nums)
    println("Sum of odd nos of list:$sum")
}
fun sumofoddnos(nums: List<Int>): Int
{
    var sum = 0
    for(n in nums)
    {
        if(n % 2 != 0)
            sum=sum+n         //Function to find sum of odd no
    }
    return sum
}