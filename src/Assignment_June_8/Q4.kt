package Assignment_June_8

fun main()
{
    val word = listOf("Apple","Banana","Mango","Fly")
    val words = word.filter{ it.length >4 }      //Counts size of words
    val count = words.size
    print("Words with more than 4 characters:$count")
}