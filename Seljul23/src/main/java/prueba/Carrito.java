package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Carrito {

	public static void main(String[] args) throws InterruptedException {
		
		//Declarar ubicación Driver
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		//Instanciar webdriver
		WebDriver driver = new ChromeDriver();
		
		//Abre el navegador
		driver.get("https://saucedemo.com/");
		
		//Maximiza la página
		driver.manage().window().maximize();
		//Variables
		String user_name = "standard_user";
		String password = "secret_sauce";
		
		//Obtener elementos de la pagina web
		 WebElement userNametxt = driver.findElement(By.id("user-name"));
		 WebElement pwdTxt = driver.findElement(By.id("password"));
		 WebElement loginBtn = driver.findElement(By.id("login-button"));
		 
		 //Acciones con los elementos web
		 //Haciendo el login
		 userNametxt.sendKeys(user_name);
		 //Thread.sleep(2000); //tiempo de espera
		 pwdTxt.sendKeys(password);
		//Thread.sleep(2000); //tiempo de espera
		 loginBtn.click();
		 
		 //Metodo de explorador
		 //Obtener el Titulo de la página
		 String title = driver.getTitle();
		 System.out.println("Titulo es. " + title);
		//Obtener la URL actual de la página
		 String url = driver.getCurrentUrl();
		 System.out.println("La URL es; " + url);
		 
		 //Navegadores de página
		 //driver.navigate().back();
		 //driver.navigate().forward();
		 //driver.navigate().refresh();
		 
		 //Verificar que un elemento esta desplegado en la página
		 //declara variable                        Busca elemento desplegado
		 boolean inventoryItemNameIsDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		 if(inventoryItemNameIsDisplayed) {
			 System.out.println("Articulo desplegado");
		 }
		 //Obtener texto de WebElement
		 String itemName = driver.findElement(By.className("inventory_item_name")).getText();
		 
		 if(itemName.contains("Sauce Labs")) {
			 System.out.println("correcto"); 
		 }else {
			 System.out.println("incorrecto");
		 }
		 
		 //Ejemplo de DropDown
		 
		 Select oSelect = new Select(driver.findElement(By.xpath("//select[@data-test = 'product_sort_container']")));
		 oSelect.selectByValue("lohi");
		 Thread.sleep(2000); //tiempo de espera
		 Select oSelect2 = new Select(driver.findElement(By.xpath("//select[@data-test = 'product_sort_container']")));
		 oSelect2.selectByValue("hilo");
		 
		 
		 WebElement addCartBtn = driver.findElement(By.xpath("//button[@data-test = 'add-to-cart-sauce-labs-fleece-jacket']"));
		 addCartBtn.click();
		 WebElement CartBtn = driver.findElement(By.className("shopping_cart_link"));
		 CartBtn.click();
		 WebElement CheckBtn = driver.findElement(By.xpath("//button[@data-test = 'checkout'] "));
		 CheckBtn.click();
		 
		  WebElement firstNameTxt = driver.findElement(By.id("first-name"));
		  WebElement lastNameTxt = driver.findElement(By.id("last-name"));
		  WebElement postalCodeTxt = driver.findElement(By.id("postal-code"));
		  WebElement ContinueBtn = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		  
		  firstNameTxt.sendKeys("Ricardo");
		  lastNameTxt.sendKeys("Garcia");
		  postalCodeTxt.sendKeys("57460");
		  Thread.sleep(2000); //tiempo de espera
		  ContinueBtn.click();
		  
		  WebElement finishBtn = driver.findElement(By.xpath("//button[@data-test = 'finish']"));
		  finishBtn.click();
		  
		  boolean confirmacion = driver.findElement(By.className("complete-header")).isDisplayed();
		  if(confirmacion) {
			  
			  System.out.println("confirmado");
		  }
		  String TxtConf = "Thank you for your order!";
		  String textoconfirmacion = driver.findElement(By.className("complete-header")).getText();
		  if(textoconfirmacion.contains(TxtConf)) {
			  System.out.println("correcto"); 
			 }else {
				 System.out.println("incorrecto");
			 }
		  //driver.quit();
	}

}
