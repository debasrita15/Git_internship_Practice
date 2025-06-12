package Assignment_June_10

fun main()
{
    Logger.log("Its Snana Purnima today!!")
}
object Logger
{
    fun log(message: String)
    {
        println("Log: $message")   //Singleton object
    }
}