import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.selenium.WebBrowser
import org.openqa.selenium._

import org.openqa.selenium.chrome.ChromeDriver



class Test08 extends FlatSpec with Matchers with WebBrowser {

  implicit val webDriver: WebDriver = new ChromeDriver()
  go to "http://www.amazon.com"
  click on "twotabsearchtextbox"
  textField("twotabsearchtextbox").value = "Scala"
  submit()
  //pageTitle should be ("Amazon.com: Scala123")
  pageTitle should be ("Amazon.com: Scala1")
  pageSource should include("Scala Cookbook: Recipes")


}
