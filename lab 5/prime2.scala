
//prime using nested function
object prime2 {
  def isprime(num:Int){
    def prime()
    {
      var count =0;
      for(i <- 1 to num)
        {
        if(num%i==0)
          count=count+1;
          }
        if(count == 2)
              println("prime")
         else
             println("not prime")    
    }
    prime()
  }
  def main(args:Array[String]){
  val num = readInt();
  isprime(num)
  }
}