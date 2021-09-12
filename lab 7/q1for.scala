

object q1for {
   def main(args: Array[String]) {
   var i = 0
   println("varient 1")
    for (i <- 1 to 3) {
      println(i)
    }
   i = 0
   var j =0
   println("varient 2")
    for (i <- 1 to 3;j<- 1 until 3) {
      println(j)
    }

   println("varient 3")
          val t = List(4,3,5,2)
         var k= for(i <- t if i!=3;if i<5)yield i       
          for(i <- k; if i!=3)
            println(i)
}
}