fun main(args : Array<String>){
    /**
     * Exercise : 1
     * Read a number from the console and convert it to Double.
     * Multiply it by 8, and convert the result into a string.
     * Print the length of that string to the console.
     */
    print("Enter a Number : ")
    val n : String? = readLine()?:""
    val m = n?.toDouble()?.times(8)?.toString()
    println("Length of the $m is ${m?.length}")

    /**Routput:
     * Enter a Number : 54.9
     * Length of the 439.2 is 5
     */

}