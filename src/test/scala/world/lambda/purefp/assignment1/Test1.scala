package world.lambda.purefp.assignment1

import org.specs2.mutable.Specification

class Test1 extends Specification {

  "Test the addition" in {

    val calculator = new Calculator()

    calculator.sum(2, 3) === 5

  }
}
