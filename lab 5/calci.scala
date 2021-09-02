

object calci {
    val div = (a:Int,b:Int)=>a/b
    val mul = (a:Int,b:Int)=> a*b
    def main(args:Array[String])
    {
        
        println("Enter vaue of a and b");
        val a:Int=readInt()
        val b:Int=readInt()
        println("division is = " + div(a,b));
        println("Multiplication is = " + mul(a,b));
        
    }
}