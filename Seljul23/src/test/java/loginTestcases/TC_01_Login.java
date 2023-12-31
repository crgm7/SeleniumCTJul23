package loginTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationsPages.SauceLoginPage;

public class TC_01_Login {
	
	//Declarar e inicializar el webDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	SauceLoginPage loginPage = new SauceLoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	
  @Test
  public void TC_01() {
	 loginPage.loginSauce(GlobalVariables.USER_NAME, GlobalVariables.PASSWORD);
	 Assert.assertTrue(loginPage.validaLogin());
	 
  }
  
 @AfterTest
  public void closeDriver() {
	  driver.close();
  }
}
