package world.lambda.purefp.assignment2

class Calculator {

  var evilAggregate = 0

  def sum(x1: Int, x2: Int): Int = {

    val sum = x1 + x2

    val evilResult = evilAggregate + sum
    evilAggregate = sum

    evilResult
  }
}
