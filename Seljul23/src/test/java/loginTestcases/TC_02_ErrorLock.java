package loginTestcases;

import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationsPages.SauceLoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TC_02_ErrorLock {
	
	//declarar e inicializar el webDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	SauceLoginPage loginPage = new SauceLoginPage(driver);
	
	@BeforeTest
	  public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	  }
	
  @Test
  public void TC_02() {
	  loginPage.loginSauce(GlobalVariables.USER_NAME_LOCK, GlobalVariables.PASSWORD);
	  Assert.assertTrue(loginPage.validaLockError());
  }
  

  //@AfterTest
  //public void closeDriver() {
	//  driver.close();
  //}

}
