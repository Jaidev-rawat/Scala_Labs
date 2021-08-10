
//Write a function in scala that takes two numbers as parameters and returns the 
//Maximum and Minimum of them. (Use Single Nested Function)
object MaxAndMin 
{
// Main method 
def main(args: Array[String]) { 
println("Min and Max from 5, 7") 
maxAndMin(5, 7); 
} 
// Function 
def maxAndMin(a: Int, b: Int) = { 
// Nested Function 
def maxValue() = { 
if(a > b) 
   println("Max is: " + a) 
 
else
  println("Max is: " + b)  
} 
// Nested Function 
def minValue() = { 
if (a < b) 
  println("Min is: " + a) 
else
  println("Min is: " + b) 
} 
maxValue(); 
minValue(); 
} 
}