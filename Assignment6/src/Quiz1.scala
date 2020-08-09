import math.{sqrt,pow}
object Quiz1 extends App{
  val p1=new Point(2,3)
  val p2=new Point(3,5)
  val p3=p1.move(2,3)
 
  println(p1)
  println(p2)
  println(p3)
  println(p1+p2)
  println(p1.distance(p2))
  println(p1.invert())
  }

case class Point(x:Int,y:Int){
  def g:Int=x
  def h:Int=y
  
  def +(that:Point)=Point(this.g+that.g,this.h+that.h)
  def move(dx:Int,dy:Int)=Point(this.g+dx,this.h+dy)
  def distance(other:Point):Double=sqrt(pow(x-other.x,2)+pow(y-other.y,2))
  def invert()=Point(this.x,this.y)
}