fun main(args : Array<String>)
{
    var num1 = 9
    var num2 = 555554954238;
    var num3 = 29.5f
    var num4 = 654.9654
    var num5 = 54L
    var num6 : Short = 5;
    println("Number is \"${num1::class.java}\" data")
    println("Number is \"${num2::class.java}\" data")
    println("Number is \"${num3::class.java}\" data")
    println("Number is \"${num4::class.java}\" data")
    println("Number is \"${num5::class.java}\" data")
    println("Number is \"${num6::class.java}\" data")
}

//Routput

//Number is "int" data
//Number is "long" data
//Number is "float" data
//Number is "double" data
//Number is "long" data
//Number is "short" data
