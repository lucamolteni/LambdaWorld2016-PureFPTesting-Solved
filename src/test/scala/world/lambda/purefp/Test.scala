package world.lambda.purefp

import org.specs2.mutable.Specification


class Test extends Specification {

  "Our test should" should {
    "contain 11 characters" in {
      Example.prova must haveSize(11)
    }
  }
}