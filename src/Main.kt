import java.io.File

fun main (args : Array<String>) {
    val filename = "UsernameList.txt"

    var file = File(filename)

    print("Enter your name: ")
    var name = readLine()!!
    print("Enter your age: ")
    var age = readLine()!!.toInt()
    print("Enter your reddit username: ")
    var username = readLine()!!

    println("Your name is $name, you are $age years old, and your username is $username")

    file.appendText("$name $age $username\n")
}