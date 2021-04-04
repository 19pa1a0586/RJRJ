fun main(args : Array<String>){
    /** Exercise : 1
     * Read data from the console and convert it into a number
     * If possible, multiply it by 5 and print.
     * If an exception occurs, catch it and print a meaningful message.
     */
    print("Enter a Number : ")
    val n = readLine()
    try {
        val m = n?.toInt()?.times(5)
        println("$n * 5 = $m")
    }
    catch (e : Exception){
        println("Input Should be Number")
        e.printStackTrace()
    }
    finally {
        println("Program Completed!")
    }

    /** Routput : 1
     * Enter a Number : 9
     * 9 * 5 = 45
     * Program Completed!
     */

    /** Routput : 2
     * Enter a Number : nine
     * Input Should be Number
     * java.lang.NumberFormatException: For input string: "nine"
     *     at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
     *     at java.base/java.lang.Integer.parseInt(Integer.java:652)
     *     at java.base/java.lang.Integer.parseInt(Integer.java:770)
     *     at Try_Catch_Finally_ExcerciseKt.main(Try Catch Finally Excercise.kt:10)
     * Program Completed!
     */

    /** Exercise : 2
     * The user must input how many kilometers they ran today.
     * Convert that value to miles.
     * Handle any exceptions that might occur.
     * 1 kilometer = 0.62 miles
     */
    print("Enter the km you ran today : ")
    val km = readLine()
    try {
        var miles = km?.toDouble()?.times(0.62)
//        var miles = m?.times(0.62)
        println("You Ran $miles Miles Today!")
    }
    catch (e : Exception){
        println("Input Should be Number")
    }
    finally {
        println("Program Completed!")
    }

    /** Routput : 1
     * Enter the km you ran today : 42
     * You Ran 26.04 Miles Today!
     * Program Completed!
     */

    /** Routput : 2
     * Enter the km you ran today : nine
     * Input Should be Number
     * Program Completed!
     */
}