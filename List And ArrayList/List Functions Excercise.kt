fun main(args : Array<String>){
    /** Exercise : 1
     * This is the list of winners of the men’s 100m race.
     *     val winners = listOf(“Usain”, “John”, “Michael”, “Alex”, “Bob”)
     * What place did Michael finish on?
     */
    val winners = listOf<String>("Usain","John","Michael","Alex","Bob")
    println("Michael finished at ${winners.indexOf("Michael") + 1} place")

    /** Routput:
     * Michael finished at 3 place
     */

    /** Exercise :2
     * A printer needs the colors red, green and blue to print.
     * A printer on your desk has the following colors available
     *        val availableColors = listOf(“red”, “blue”)
     * Design a program that prints out a boolean value, on whether or not the printer can print.
     */
    val availableColors = listOf("red","blue")
    val neededColors = listOf("red","blue","green")
    println("Printer can print : ${availableColors.containsAll(neededColors)}")

    /** Routput
     * Printer can print : false
     */

    /** Exercise : 3
     * A recipe calls for the following ingredients
     * Chicken
     * Egg
     * Mozzarella
     * Pepper
     * You decide to replace the Mozzarella with blue cheese
     * Print out the list of ingredients
     */
    val ingredients = arrayListOf("Chicken","Egg","Mozzarella","Pepper")
    println("List of Ingredients are : $ingredients")
//    ingredients.set(2,"Blue Cheese")
    ingredients[ingredients.indexOf("Mozzarella")] = "Blue Cheese"
//    ingredients.set(ingredients.indexOf("Mozzarella"),"Blue Cheese")
    println("List of Ingredients after modified are : $ingredients")

    /** Routput:
     * List of Ingredients are : [Chicken, Egg, Mozzarella, Pepper]
     * List of Ingredients after modified are : [Chicken, Egg, Blue Cheese, Pepper]
     */
}