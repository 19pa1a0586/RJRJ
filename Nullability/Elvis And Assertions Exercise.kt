fun main(args : Array<String>){
    /**A product costs 29.99.
     * Ask a user at the console how many products they want to buy.
     * If the read value is null, use the default of one.
     * Print the total of the purchase.
     */
    val product = 29.99
    print("Enter the Quantity : ")
    val n = readLine()
    val qnt = n?.toInt()?:1
    println("Total amount : ${qnt * product}")

    /** Routput
     * Enter the Quantity : 4
     * Total amount : 119.96
     */
}