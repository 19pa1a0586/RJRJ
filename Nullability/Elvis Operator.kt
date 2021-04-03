fun main(args : Array<String>){
    // Elvis Operator(?:) works as "or" operator
    val name : String? = null
    println("Length of name : ${name?.length}") // O/P: Length of name : null
    println("Length of name : ${name?:"Siva Prasad".length}") // o/p: Length of name : 11
    // Here, if name is given then it prints the length of the name (or) it will print the length of the default name "Siva Prasad"

}