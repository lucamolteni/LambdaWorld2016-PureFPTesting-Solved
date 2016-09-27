package world.lambda.purefp.assignment7

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

// Write the implementation of Concatenator in order to make this test pass.
// Then break the property by inserting a non deterministic side effect
object Test7PropertyBased extends Properties("Concatenator") {

  property("concatenate") = forAll { (a: String, b: String) =>

    Concatenator.concatenate(a, b).length == a.length + b.length
  }

}