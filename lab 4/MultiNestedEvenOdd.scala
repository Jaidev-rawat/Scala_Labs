


// 4. Write a program in scala to check the number is even or odd(Multiple Nested Function

object MultiNestedEvenOdd {
 def main(args: Array[String]) 
{ 

evenOdd(20); 
} 
def evenOdd(a: Int) = { 
//NestedFunction01
 def findEven()={
// Nested Function 02
   evenValue();
def evenValue() = { 
if(a%2==0) 
  println(a+" is even") 
else
    println(a+" is odd") 
}}
 
findEven(); 

} 
}