fun main(args : Array<String>)
{
    //Implicit : default datatype given by kotlin compiler
    //Implicit numbers are decided by Kotlin
    //Kotlin decides the most appropriate variable type	based on the value provided
    val num1 = 9
    println("Number is \"${num1::class.java}\" data")
    val num2 = 5.4
    println("Number is \"${num2::class.java}\" data")
    val ri = 'r'
    println("Number is \"${ri::class.java}\" data")
    val str = "raju"
    println("Number is \"${str::class.java}\" data")

    println()

    //Explicit : Specific datatype is Specified by us
    //We can instruct Kotlin to assign a different type to our variables
    val num3 : Byte = 9
    println("Number is \"${num3::class.java}\" data")
    val num4 : Short = 9
    println("Number is \"${num4::class.java}\" data")
    val num5 : Int = 9
    println("Number is \"${num5::class.java}\" data")
    val num6 : Long = 9
    println("Number is \"${num6::class.java}\" data")
    val num7 : Float = 5.4F
    println("Number is \"${num7::class.java}\" data")
    val num8 : Double = 5.4
    println("Number is \"${num8::class.java}\" data")
    val r : Char = 'r'
    println("Number is \"${r::class.java}\" data")
    val str2 : String = "raju"
    println("Number is \"${str2::class.java}\" data")

}

//Routput

//Number is "int" data
//Number is "double" data
//Number is "char" data
//Number is "class java.lang.String" data
//
//Number is "byte" data
//Number is "short" data
//Number is "int" data
//Number is "long" data
//Number is "float" data
//Number is "double" data
//Number is "char" data
//Number is "class java.lang.String" data