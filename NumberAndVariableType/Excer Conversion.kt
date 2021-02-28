fun main(args : Array<String>)
{
    //You have the variable
    val pi = 3.14159

    //What is the type?
    println("Number $pi is of ${pi::class.java} data")

    //Convert it to a float. What is the value? Print it.
    val num1 = pi.toFloat()
    println("Number $num1 is of ${num1::class.java} data")

    //Convert it to an int. What is the value? Print it.
    val num2 = pi.toInt()
    println("Number $num2 is of ${num2::class.java} data")

    //Convert it to a string. What is the value? Print it.
    val str = pi.toString()
    println("Number $str is of ${str::class.java} data")

}


//Rquestion

//You have the variable
//pi = 3.14159
//What is the type?
//Convert it to a float. What is the value? Print it.
//Convert it to an int. What is the value? Print it.
//Convert it to a string. What is the value? Print it.

//Routput

//Number 3.14159 is of double data
//Number 3.14159 is of float data
//Number 3 is of int data
//Number 3.14159 is of class java.lang.String data

