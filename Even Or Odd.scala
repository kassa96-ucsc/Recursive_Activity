object Even_Or_IsOddNumber extends App{

    def Even(x:Int):Boolean = x match{
        case 0 => true
        case _ => IsOddNumber(x-1)
    }

    def IsOddNumber(x:Int):Boolean = !Even(x)

    println(Even(10))
    println(IsOddNumber(5))
    println(IsOddNumber(4))

}