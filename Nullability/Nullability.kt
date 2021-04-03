fun main(args : Array<String>)
{
    var stdName : String? = null // ? is the Nullability
    // we can assign null or any string for the variables declared as Nullability(?)
    // we can't assign null to the Non Null variable

    var stdName2 : String? = "Raju"
    println("Length of stdName is : ${stdName2?.length}") // ?. used for variable called as "Null Safe Call"
    println("Length of stdName is : ${stdName2?.length?.toString()}")
}