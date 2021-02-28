fun main(args : Array<String>)
{
    print("Enter a Number : ")
    val num = readLine()?:""
    val num1 = num.toInt()
    val num2 = 5.4
    val res = num1*num2
    println("Number $res is of \"${res::class.java}\" data")
}


//Rquestion

//Ask the user to input a number and read it into a variable.
//
//Convert it to an integer.
//
//Multiply that value with a double variable that you created.
//
//What is the type of the new variable?
//
//Print it to the console.


//Routput
//Enter a Number : 4
//Number 21.6 is of "double" data
