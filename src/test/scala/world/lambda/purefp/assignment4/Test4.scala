package world.lambda.purefp.assignment4

import org.specs2.mock.Mockito
import org.specs2.mutable.Specification

class Test4 extends Specification with Mockito {

  "Testable Cafe should be able to charge an amount" >> {

    val cafe = new TestableCafe()

    val mockedPayment = mock[Payments]
    val cc = CreditCard()

    val coffee = cafe.buyCoffee(cc, mockedPayment)

    there was one(mockedPayment).charge(cc, 1)
  }

  "Testable Cafe should be able to charge an amount with manual mock" >> {

    case class PaymentsMock(var cc: CreditCard, var amountCharged: BigDecimal)
        extends Payments {
      override def charge(cc: CreditCard, amount: BigDecimal): Unit = {
        this.cc = cc
        this.amountCharged = amount
      }
    }

    val cafe = new TestableCafe()

    val mockedPayment = new PaymentsMock(null, 0)
    val cc = CreditCard()

    val coffee = cafe.buyCoffee(cc, mockedPayment)

    mockedPayment.cc === cc
    mockedPayment.amountCharged === 1
  }
}
