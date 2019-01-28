import org.scalatest.FunSuite

class Test02 extends FunSuite {
  test("pass") {
    assert("abc" === "abc")
  }
  test("fail and show diff") {
    assert("abc" === "abcd") // provide reporting info
  }
}
