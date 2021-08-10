
//2. Write a function in scala that takes two numbers as parameters and returns the 
//Maximum and Minimum of them. (Use Multi Nested Function
object multiNestedMaxMin {
 def main(args: Array[String]) 
{ 
println("To Find Min and Max from 20, 15") 
maxAndMin(20, 15); 
} 
def maxAndMin(a: Int, b: Int) = { 
//NestedFunction01
 def findmax()={
// Nested Function 02
   maxValue();
def maxValue() = { 
if(a > b) 
  println("Max is: " + a) 
else
  println("Max is: " + b) 
}}
 // Nested Function 01
def findmin()={
// Nested Function 02
  minValue()
def minValue() = { 
if (a < b)  
  println("Min is: " + a) 
else
  println("Min is: " + b) 
}}
findmax(); 
findmin(); 
} 
}