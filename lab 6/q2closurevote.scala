

object q2closurevote {
 
  def main(args: Array[String]){
    var age = 20
   var votefunc = (result:String)=>{
     if(age>=18)
           "can vote"
     else 
          "can not vote"
     
   }
    println(votefunc(""))
  }
}