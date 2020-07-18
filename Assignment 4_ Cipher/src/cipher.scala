

object cipher {
  def main(args: Array[String]) {
  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  
 val a="HELLOSRILANKA"
 val b="JAVA"
  
  
  val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  
  val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
  
  val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
  
  val ct=cipher(E,a,5,alphabet)
  
  val pt=cipher(D,b,5,alphabet)
  
  println(ct)
  println(pt)
  }
}