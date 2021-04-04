fun main(args : Array<String>){
    /** Exercise : 1
     * Create a list of your favourite animals.
     * Print out how many animals you have in your list.
     * Print out the second element in that list
     */
    val favAml = listOf("Monkey","Puppy","Horse")
    println("Number of animals : ${favAml.size}")
    println("Second Animal is \"${favAml[1]}\"")

    /** Routput:
     * Number of animals : 3
     * Second Animal is "Puppy"
     */

    /** Exercise : 2
     * Create an ArrayList of customers to your online store and add some customers.
     * A new customer has signed up, add them to the list.
     * A customer has chosen to close their account. Remove them from the list.
     */
    val customers = arrayListOf("Raju","Rishika","Siva","Rahul")
    println("List of Customers are : $customers")
    customers.add("Ravi")
    println("List of Customers after adding \"Ravi\" are : $customers")
    customers.remove("Rahul")
    println("List of Customers after removing \"Rahul\" are : $customers")

    /** Routput
     * List of Customers are : [Raju, Rishika, Siva, Rahul]
     * List of Customers after adding "Ravi" are : [Raju, Rishika, Siva, Rahul, Ravi]
     * List of Customers after removing "Rahul" are : [Raju, Rishika, Siva, Ravi]
     */

    /** Exercise : 3
     * You have a number of items on your desk.
     *          val items = arrayListOf(“laptop”, “mouse”, “pen”, “paper”, “mug”, “phone”)
     * You clean up your desk and remove as many items as you can to be more productive.
     *          val removedItems = listOf(“pen”, “paper”, “mug”, “phone”)
     * Print out the remaining items.
     */

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")
    println("Items on the desk are : $items")
    items.removeAll(removedItems)
    println("Items on the desk after removing unnecessary items are : $items")

    /** Routput:
     * Items on the desk are : [laptop, mouse, pen, paper, mug, phone]
     * Items on the desk after removing unnecessary items are : [laptop, mouse]
     */
}