package world.lambda.purefp.assignment7

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object Test7PropertyBased extends Properties("Concatenator") {

  property("concatenate") = forAll { (a: String, b: String) =>

    Concatenator.concatenate(a, b).length == a.length + b.length
  }

}