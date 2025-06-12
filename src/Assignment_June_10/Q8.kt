package Assignment_June_10

fun main()
{
    val p= Person("Debasrita",19)
    println(p.details())
}
class Person(val name: String,val age: Int)
{
    fun details(): String
    {
        return "Name:$name,Age=$age"        //create a class
    }
}