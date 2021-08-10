

//3. Write a program in scala to check the number is even or odd(Single Nested Function)

object nestedevenodd 
{
// Main method 
def main(args: Array[String]) { 

evenOdd(5); 
} 
// Function 
def evenOdd(a: Int) = { 
// Nested Function 
def isEven() = { 
if(a%2==0) 
   println(a+" is even"); 
 
else
 println(a+" is odd");  
} 
// Nested Function 

isEven(); 

} 
}