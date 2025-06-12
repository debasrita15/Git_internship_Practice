package Assignment_June_10

fun main()
{
    val p= Person1("Debasrita")
    println("Name: ${p.name},Age: ${p.age}")
}
class Person1(val name: String,val age: Int)
{
    constructor(name: String) : this(name,19)   //Secondary constructor
}