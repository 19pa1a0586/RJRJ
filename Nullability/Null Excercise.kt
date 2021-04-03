fun main(args : Array<String>){
    /**
     * Exercise : 1
     * Declare a nullable variable of type String and give it a value.
     * Print out a substring of it, from position 3 to 6.
     */
    val str : String? = "Siva Prasad"
    println("Str from 3 to 6 is \"${str?.substring(3,6)}\"")

    //Routput1:
   // Str from 3 to 6 is "a P"

    /**
     * Exercise : 2
     * Declare a nullable variable of type Double.
     * Multiply it by 6, convert it to a Float and print it to the console.
     */
    var n : Double? = 54.9
     n = n?.times(6)
    val res = n?.toFloat()
    println("Class is : \"${res!!::class.java}\"") // for knowing the nullable class we need to use !! after the variable name
    println("n * 6 = $res")

    /**
     * Routput2:
     * Class is : "class java.lang.Float"
     * n * 6 = 329.4
     */

    /**
     * Exercise : 3
     * Receive the name of the user from the console.
     * Print out the length of the name.
     */
    print("Enter you name : ")
    val name : String? = readLine()
    println("Length of the name : ${name?.length}")

    /**
     * Routput3:
     * Enter you name : Siva Prasad
     * Length of the name : 11
     */
}