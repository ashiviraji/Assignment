

object Assignment2Quiz1 {
  def main(args:Array[String]){
    def takeHome(x1:Int,x2:Int):Double=4*(income(x1,x2)-tax(income(x1,x2)))
    def tax(income:Int):Double=income*.1
    def income(h1:Int,h2:Int):Int=wage(h1)+ot(h2)
    def wage(hours:Int):Int=hours*150
    def ot(hours:Int)=hours*75
    println(takeHome(40,20))
  }
}