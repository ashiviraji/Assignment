

object book {
  def main(args:Array[String]){
  calculateCost(60)
  }
  
    
  def calculateCost(c:Int){
  var coverPrice:Double=24.95
  var discountPrice:Double=coverPrice*0.40
  var additional:Double=0.00
  var totalShippingCost:Double=0.00
  var totalCost:Double=0.00
  if(c>50){
    additional=(c-50)*0.75
    totalShippingCost=3+additional
  }else{
    totalShippingCost=3
  }
  totalCost=(coverPrice-discountPrice)*c+totalShippingCost
  println("The total wholesale cost is:"+totalCost)
  }
}
  
