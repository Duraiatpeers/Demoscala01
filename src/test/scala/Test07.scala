import org.scalatest.FlatSpec

import org.scalatest.Matchers

class Test07 extends FlatSpec with Matchers {
  "This test" should "pass" in {
    true should be equals true
  }
}
