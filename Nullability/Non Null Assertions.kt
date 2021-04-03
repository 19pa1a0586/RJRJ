fun main(args : Array<String>){
    /**  Non null assertion(!!.)  A developer guarantee that the variable is not null
     *   Warning: This bypasses all the language checks for null safety	Can trigger a program crash
     *   Try to avoid it as much as you can
     */
    val name: String? = null
    println(name!!.length)

    /** Routput:
     * Program will crash by giving the "NullPointerException"
     */
}