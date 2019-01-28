import org.openqa.selenium._
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{FunSuite, Matchers}

class Test10 extends FunSuite with Matchers with WebBrowser  {
  implicit val webDriver: WebDriver = new ChromeDriver()
  val host = "http://www.baidu.com"

  test("Google browser works!") {
    go to (host)

    click on "kw"
    textField("kw").value = "Cheese!"
    submit()

    assert (pageTitle contains ("Cheese!") )
  }
} 