package Assignment_June_8

fun main()
{
    val StringList= listOf("Apple","Banana","Mango","Orange","Strawberry")
    val longest = longestString(StringList)
    println("Longest string:$longest")
}
fun longestString(strings: List<String>): String
{
    var longest = strings[0]
    for(str in strings)
    {
        if(str.length > longest.length)
            longest = str            //Longest String om the list
    }
    return longest
}