fun main(args : Array<String>){
    print("Enter a Number : ")
    val input = readLine()?:"" // (?:"") means If we didn't (?) write anything then (:) it will remains a string("")
    println("Result is : ${input.toInt() * 5}")
}
