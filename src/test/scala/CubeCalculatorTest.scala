import org.scalatest.{BeforeAndAfter, FunSuite}

class CubeCalculatorTest extends FunSuite with BeforeAndAfter{


  before{
    println("Inside before")
  }

  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator.zerocube") {
    assert(CubeCalculator.cube(0) === 0)
  }

  after{
    println("Inside after")
  }

}
