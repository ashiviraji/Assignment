object Bank extends App {

  class Account(val name: String, val nic: String, val accountNum: Int, var balance: Double) {

    override def toString: String = "Account Name: " + name + "-> Account Balance: " + balance
  }

  val listAccounts = List(new Account("A", "11111", 1, 0), new Account("B", "22222", 2, 1000), new Account("C", "33333", 3, -400),new Account("D","44444",4,-500));

  def negativeBalancedAccounts(list: List[Account]): List[Account] =
    list.filter(x => x.balance < 0)

  def sumOfAllAccountBalances(list: List[Account]): Double =
    list.map(x => x.balance).sum

  def applyInterest(list: List[Account]): Unit =
    list.foreach(x => {
      if (x.balance < 0) x.balance += x.balance * 0.1
      else x.balance += x.balance * 0.05
    })
  print("Negative accounts are:");
  val sol1 = negativeBalancedAccounts(listAccounts)
  println(sol1)

  print("Sum of all account balances accounts are:");
  val sol2 = sumOfAllAccountBalances(listAccounts)
  println(sol2)

  applyInterest(listAccounts)
  print("Final account balances accounts after apply interest:");
  println(listAccounts)

}