package world.lambda.purefp.assignment3

import org.specs2.mutable.Specification

class Test3 extends Specification {

  /*  "Non determinstic test" >> {

    val cafe = new UntestableCafe()

    val coffee = cafe.buyCoffee(new CreditCard())

    success("hopefully charged")
  }*/

  "Deterministic test case" >> {

    val cafe = new UntestableCafe()

    // There might be some languages where this is not allowed.
    // Lucky us, Scala is not one of them

    val noopCreditCard = new CreditCard() {
      override def charge(price: BigDecimal): Unit = ()
    }

    val coffee = cafe.buyCoffee(noopCreditCard)

    success("hopefully charged")
  }
}
