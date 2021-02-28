fun main(args : Array<String>)
{
    val num1 = 9
    val num2 = num1.toByte()
    val num3 = 545L
    val num4 = num3.toShort()
    val num5 = num2.toLong()
    val num6 = num3.toInt()
    val r = 'r'
    val num8 = r.toInt()
    val str2 = num3.toString()
    println("Number is \"${num1::class.java}\" data")
    println("Number is \"${num2::class.java}\" data")
    println("Number is \"${num3::class.java}\" data")
    println("Number is \"${num4::class.java}\" data")
    println("Number is \"${num5::class.java}\" data")
    println("Number is \"${num6::class.java}\" data")
    println("Number is \"${r::class.java}\" data")
    println("Number is \"${num8::class.java}\" data")
    println("Number is \"${str2::class.java}\" data")

    println()

    println("Number is $num1 data")
    println("Number is $num2 data")
    println("Number is $num3 data")
    println("Number is $num4 data")
    println("Number is $num5 data")
    println("Number is $num6 data")
    println("Number is $r data")
    println("Number is $num8 data")
    println("Number is $str2 data")


//    val str = "raju"
//    val num9 = str.toInt()
//    println("Number is \"${str::class.java}\" data")
//    println("Number is \"${num9::class.java}\" data") //Exception in thread "main" java.lang.NumberFormatException: For input string: "raju"
//    println("Number is $str data")
//    println("Number is $num9 data") //Exception in thread "main" java.lang.NumberFormatException: For input string: "raju"
}