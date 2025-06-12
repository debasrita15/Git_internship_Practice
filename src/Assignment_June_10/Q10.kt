package Assignment_June_10

fun main()
{
    val dog = Dog()
    dog.makeSound()
}
open class Animal
{
    open fun makeSound()
    {
        println("Animal sound")
    }
}
class Dog: Animal()
{
    override fun makeSound()
    {
        println("Barking")        //inheritance and overriding
    }
}