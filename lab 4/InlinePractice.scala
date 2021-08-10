
//5. Practice few inline or first class functions for below scenarios :
object InlinePractice {
   def main(args: Array[String]) {

    var increase = (a: Int) => (a + 1);//adding one to an integer value
    var checkzero = (a: Int) => (a == 0);//Check integer value is 0 or not
    var add = (a: Int, b: Int) => (a + b);//add
    var multiply = (a: Int, b: Int) => (a * b);//multiply

    println("Increment of 5 is : " + increase(5));
    println("Check if 5 is zero : " + checkzero(5));
    println("Sum of 60 and 40 : " + add(60, 40));
    println("Product of 5 and 5 : " + multiply(5, 5));

  }
  
}