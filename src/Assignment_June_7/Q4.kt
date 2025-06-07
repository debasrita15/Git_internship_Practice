package Assignment_June_7

fun main()
{
    var s = "Small"
    var l = "Large"
    val t = s
    println("Before Swapping: Small=" +s+ " Large="+l)
    s=l                 // Swap values
    l=t
    println("After swapping: Small=" +s+ " Large=" +l)
}