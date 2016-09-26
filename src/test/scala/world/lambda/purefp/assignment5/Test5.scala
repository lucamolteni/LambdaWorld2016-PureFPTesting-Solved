package world.lambda.purefp.assignment5

import org.specs2.mutable.Specification

class Test5 extends Specification {
  "Cafe should be able to charge an amount" >> {

    val cafe = new PureCafe()

    val result = cafe.buyCoffee(new CreditCard())

    result._2.amount === 1
  }
}
