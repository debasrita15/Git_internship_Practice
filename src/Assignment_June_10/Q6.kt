package Assignment_June_10

fun main()
{
    val address: String? = null
    //val len = address!!. length   //NullPointer
    val len = address?. length?: 0  //Fixing nullPointer exception
    println(len)
}