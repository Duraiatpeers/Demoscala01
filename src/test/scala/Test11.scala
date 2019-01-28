
import org.openqa.selenium._
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{FunSpec, Matchers}

class Test11 extends FunSpec with Matchers with WebBrowser {

  implicit val webDriver: WebDriver = new HtmlUnitDriver
  val host = "http://www.google.com"

  describe("Scala - js") {
    it("should check welcome length") {
      assert("welcome".length == 7)
    }

    it("should contain 'Hello World' text in its body") {
      go to(host)
      click on "btnI"

      assert (pageTitle != "Apple")
    }
  }
}
