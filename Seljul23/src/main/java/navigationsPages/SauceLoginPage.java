package navigationsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class SauceLoginPage {
	public SauceLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//LoginPage WebElements
	@FindBy (id = "user-name")
	private WebElement userNameTxt;
	@FindBy (id = "password")
	private WebElement pwdTxt;
	@FindBy (id = "login-button")
	private WebElement loginBTN;
	@FindBy (xpath = "//h3[@data-test ='error']")
	private WebElement errorlockLbl;
	@FindBy (xpath = "//h3[@data-test ='error']")
	private WebElement errorlogin;
	
	@FindBy (xpath = "//*[@id = 'header_container']")
	private WebElement texto;

	
	//Metodos de LoginPage
	public void loginSauce(String user, String pwd) {
		WrapClass.sendkeys(userNameTxt, user);
		WrapClass.sendkeys(pwdTxt, pwd);
		WrapClass.click(loginBTN);
		
	}
	public boolean validaLogin() {
		boolean Valido = WrapClass.getText(texto).contains("Swag Labs");
		return Valido;
	}
	
	public boolean validaLockError() {
		boolean errorDisplayed = WrapClass.getText(errorlockLbl).contains("Epic sadface: Sorry, this user has been locked out.");
		return errorDisplayed;
	}
}
