package world.lambda.purefp.assignment3

import scala.util.Random

class CreditCard() {
  def charge(price: BigDecimal): Unit =
    if (Random.nextInt(2) == 1)
      println("I'm calling a webservice")
    else throw new RuntimeException("crashing")
}

case class Coffee(price: BigDecimal = 1)

class UntestableCafe {
  def buyCoffee(cc: CreditCard): Coffee = {

    val cup = Coffee()
    cc.charge(cup.price) // Side effect
    cup
  }
}