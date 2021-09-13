trait Trait11
{
    def abstractMethod;
   
    
}
trait Trait22
{
   
    def nonAbstractMethod
    { 
        println("As Due to Covid 19" + " there is a nation wide lockdown")
    }
}
// DemoClass inherits trait
class DemoClass2 extends Trait11 with Trait22
{
    def abstractMethod()
    {
        println("We all are at home")
    }
}
object q4traitmultiple
{
    // Main method
    def main(args: Array[String])
    {
        val printVal = new DemoClass2();
        printVal.abstractMethod
        printVal.nonAbstractMethod
    }
}
