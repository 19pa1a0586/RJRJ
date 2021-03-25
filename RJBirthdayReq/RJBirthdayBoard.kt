fun main(args : Array<String>)
{
    val num = 9;
    val border = "-._.-"
    printBorder(border,num)
    println("      Wish You A Happy Birthday, Rishika")
    printBorder(border,num)
}

fun printBorder(border : String, num : Int)
{
    repeat(num)
    {
        print(border)
    }
    println()
}

//Routput:

//-._.--._.--._.--._.--._.--._.--._.--._.--._.-
//      Wish You A Happy Birthday, Rishika
//-._.--._.--._.--._.--._.--._.--._.--._.--._.-