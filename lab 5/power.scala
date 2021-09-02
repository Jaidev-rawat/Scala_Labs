//Write a scala program that reads a number(dynamic) and display its square, cube,
//and fourth power.

object power{
    def main(args:Array[String])
    {
      val a = readInt();
       println("Num ^2 : " + math.pow(a, 2));
        println("Num ^3 : " + math.pow(a, 3));
        println("Num ^4 : " + math.pow(a, 4));
    }
}
