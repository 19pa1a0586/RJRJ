fun main(args : Array<String>){
    val n : Int? = 4

    println("Given n = 4")
    println("n * 5 = ${n?.times(5)}")
    println("n + 5 = ${n?.plus(5)}")
    println("n - 5 = ${n?.minus(5)}")
    println("n / 5 = ${n?.div(5)}")
    println("n % 5 = ${n?.rem(5)}")

}