object Prime_Seq extends App{

    def gcd(x:Int, y:Int):Int = y match{
        case 0 => x
        case y if(y>x) => gcd(y,x)
        case _ => gcd(y,x%y)
    }

    def IsPrimeNumber(a:Int, b:Int=2):Boolean = b match{
        case x if(a==x) => true
        case x if(gcd(a,x)>1) => false
        case x => IsPrimeNumber(a,x+1)
    }

    def IsPrimeNumberSeq(b:Int):Unit = {
        if(b>1){
            IsPrimeNumberSeq(b-1)
            if(IsPrimeNumber(b)){
                print(b +" ")
            }
        }
    }

    IsPrimeNumberSeq(10)

}