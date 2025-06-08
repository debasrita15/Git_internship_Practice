package Assignment_June_8

fun main()
{
    val studMarks = mapOf("Debasrita" to 90,"Ananya" to 84,"Mukti" to 67,"Abhipsa" to 78)
    val topStuds = studMarks.filterValues { it > 75 }    //Students who scored more than 75
    val topStudsMap = topStuds.keys
    print("Top students:")
    println(topStudsMap)
}