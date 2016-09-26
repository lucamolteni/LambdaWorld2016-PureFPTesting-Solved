package world.lambda.purefp.assignment5

case class CreditCard()

case class Coffee(price: BigDecimal = 1)

case class Charge(cc: CreditCard, amount: BigDecimal)

class PureCafe {
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {

    val cup = new Coffee()

    (cup, Charge(cc, cup.price))
  }
}