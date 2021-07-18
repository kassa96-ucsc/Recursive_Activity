object AddIsEvenNumber extends App{
    
    def IsEvenNumber(x:Int):Boolean = {
        if(x%2==0) true else false
    }

    def total(x:Int):Int = x match {
        case 2 => x
        case y if(IsEvenNumber(x)) =>  x+total(x-1)
        case _ => total(x-1)
    }

    print(total(10))

}