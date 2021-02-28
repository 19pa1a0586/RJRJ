fun main(args : Array<String>)
{
    //Ask the user to input a number of type double.
    print("Enter a Number (double) : ")
    val num1 = readLine()?:""
    val num2 = num1.toDouble()

    //var pi = 4.14159
    var pi = 3.14159

    //Multiply it by pi
    val res = num2*pi

    //Print the type of the resulting variable.
    println("Number $res is of ${res::class.java}")

    //Print the result.
    println(res)
}

//Rquestion

//Ask the user to input a number of type double.
//
//Multiply it by pi
//
//var pi = 4.14159
//
//Print the type of the resulting variable.
//
//Print the result.

//Routput

//Enter a Number (double) : 9.5
//Number 29.845105 is of double
//29.845105