fun main(args : Array<String>){
    /** Exercise : 1
     * A zoo has a list of animals.
     *      val animals = arrayListOf(“lion”, “zebra”, “chimp”, “elephant”)
     * A new panda bear cub has arrived.
     * Print out the new list of animals.
     * The lion has been sold to a different zoo.
     * Print out the new list of animals.
     * Does the zoo have both elephants and giraffes?
     */
    val animals = arrayListOf("Lion","Zebra","Chimp","Elephant")
    animals.add("panda")
    println("List of Animals are : $animals")
    animals.remove("Lion")
    println("List of Animals after Lion had sold are : $animals")
    val requirdAnimals = listOf("Elephants","Giraffes")
    println("The Zoo have both Elephants and Giraffes : ${animals.containsAll(requirdAnimals)}")
//    println("Zoo has Elephants : ${animals.contains("Elephant")}")
//    println("Zoo has Giraffes : ${animals.contains("Giraffes")}")

    /**Routput:
     * List of Animals are : [Lion, Zebra, Chimp, Elephant, panda]
     * List of Animals after Lion had sold are : [Zebra, Chimp, Elephant, panda]
     * The Zoo have both Elephants and Giraffes : false
     */
}