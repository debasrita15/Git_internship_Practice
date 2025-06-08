package Assignment_June_8

fun main()
{
    val name = mutableListOf("Debasrita","Ananya","Mukti","Abhipsa")
    print("Original List:")
    println(name)
    name.removeIf{it.startsWith("A")}
    print("New list:")
    println(name)
}