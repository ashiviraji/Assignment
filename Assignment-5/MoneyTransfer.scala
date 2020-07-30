object MoneyTransfer extends App {

  class Account(private var balance: Double = 0) {

    def transferMoney(account: Account, amount: Double): Unit = {
      this.balance = this.balance-amount
      account.balance = account.balance+amount
      println(x.balance)
      println(y.balance)
    }

  }

  val x = new Account(127.3)
  val y = new Account(10.5)

  x.transferMoney(y, 10)
  

}
