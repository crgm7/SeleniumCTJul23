package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {
	
	public static void click(WebElement webE) {
		webE.click();
		
	}
	public static void sendkeys(WebElement webE,String textSend) {
		webE.sendKeys(textSend);
		
	}
	public static String getText(WebElement webE) {
		return webE.getText();     
 //comentario
	}
}
