package world.lambda.purefp.assignment4

case class CreditCard()
case class Coffee(price: BigDecimal = 1)

trait Payments { def charge(cc: CreditCard, amount: BigDecimal) }

class TestableCafe {
  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {

    val cup = new Coffee()

    p.charge(cc, cup.price)
    cup
  }
}