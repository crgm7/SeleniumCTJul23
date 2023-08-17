package prueba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("Hola");
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize(); //Maximizar Ventana
		
		//Obteniendo webElements de la pagina web	
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement pwdTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		//Haciendo login
		
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(500);
		pwdTxt.sendKeys("secret_sauce");
		Thread.sleep(500);
		loginBtn.click();
		Thread.sleep(500);
		
		//Metodos de explorador
		
		//obtener titulo de la pagina actual
		String title = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + title);
		
		//Obtener URL
		String url = driver.getCurrentUrl();
		System.out.println("La URL actual es: " + url);
		
		//Metodos de navegación
		
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
		//Verificar Elemento desplegado
		boolean inventoryItemIsDisplay = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(inventoryItemIsDisplay) {
			System.out.println("El articulo esta desplegado");
		}
		//Obtener texto de WebElement
		String itemName = driver.findElement(By.className("inventory_item_name")).getText();
		
		if(itemName.contains("Sauce Labs Backpack")) {
			System.out.println("El producto es correcto");
		}else {
			System.out.println("ERROR: EL PRODUCTO ES INCORRECTO");
		}
		
		//DropDown
		
		Select oSelect = new Select(driver.findElement(By.xpath("//select[@data-test= \"product_sort_container\"]")));
		oSelect.selectByValue("lohi");
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//oSelect.selectByVisibleText("Price (high to low)");
		
		
		//FindElements
		List<WebElement> prodList = driver.findElements(By.className("inventory_item_name"));
		System.out.println("Número de elementos en la lista: " + prodList.size());
		
		/*String primerItem = prodList.get(0).getText();
		System.out.println(primerItem);
		
		String segundoItem = prodList.get(1).getText();
		System.out.println(segundoItem);*/
		
		for(int i = 0; i < prodList.size();i++){
			System.out.println("Los productos son: " + prodList.get(i).getText());
			if(!prodList.get(i).getText().contains("Labs")) {
				System.out.println("ERROR: El producto no es un producto LABS valido");
				break;
			}	
		}
		//Cerrando Navegador Web
		//driver.close(); //Cierra la ventana/ pestaña actual que el webdriver esta usando
		driver.quit(); //Cierra todas las ventanas que Selenium abrio
	}
}
