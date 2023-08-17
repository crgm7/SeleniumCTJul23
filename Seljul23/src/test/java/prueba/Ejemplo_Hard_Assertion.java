package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ejemplo_Hard_Assertion {
  @Test
  public void Test1() {
	  
	System.out.println("Hola");
	String exePath = "./driver/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	String actualTitle = driver.getTitle();
	String expectdTitle = "Swag Labs";
	
	Assert.assertEquals(actualTitle, expectdTitle);
  }
}
