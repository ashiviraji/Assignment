

class Rational( a: Int,  b: Int) {
  def numer=a
  def denom=b
  
  def neg: Rational = new Rational(-numer, denom)

  def -(r: Rational) = new Rational(this.numer * r.denom - this.denom * r.numer, this.denom * r.denom)

  override def toString = numer+"/"+denom

}

object Test extends App {
    
  val p = new Rational(3, 4)
  val q = new Rational(5, 8)
  val r = new Rational(2, 7)

  println(p.neg)
  println(p - q - r)

}