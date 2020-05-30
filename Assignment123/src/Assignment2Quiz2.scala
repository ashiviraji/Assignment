

object Assignment2Quiz2 {
  def main(args:Array[String]){
  def attendeesCount(count:Int)=120+(15-count)/5*20
  def revenue(p:Int)=p*attendeesCount(p)
  def totalCost(p:Int)=500+3*attendeesCount(p)
  def profit(p:Int)=revenue(p)-totalCost(p)
  println("The attendess count is:"+attendeesCount(30))
  println("The revenue is:"+revenue(20))
  println("The total cost is:"+totalCost(20))
  println("The profit  is:",profit(20),profit(35),profit(15),profit(25))
  }
}