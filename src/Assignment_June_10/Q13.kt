package Assignment_June_10

fun main()
{
    val user1 = User("Debasrita","cst.23bcta65@silicon.ac.in")
    val user2 = User("Ishan","cst.23bctc56@silicon.ac.in")
    println(user1==user2)
}
data class User(val name: String,val email: String)
{
    //Comparing two objects
}