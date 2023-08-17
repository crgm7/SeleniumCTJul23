package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_Soft_Assertion {
  @Test
  public void test2() {
	  SoftAssert softassert = new SoftAssert();
	  
	System.out.println("Hola");
	String exePath = "./driver/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	String actualTitle = driver.getTitle();
	String expectdTitle = "Swag Labs";
	String badTitle = "qwssd";
	
	softassert.assertEquals(actualTitle, expectdTitle);
	softassert.assertEquals(actualTitle, badTitle);
	
	softassert.assertAll();
  }
}
