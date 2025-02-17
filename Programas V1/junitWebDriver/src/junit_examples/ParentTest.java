package junit_examples;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentTest {
	static WebDriver driver;
	
	@Before
	public void setUp() {
		//do something
		System.out.println("Set up");
		//se agrega el driver
		System.setProperty("webdriver.chrome.driver","C:\\test_automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
		
		//configuracion
		buscarPersona("Back to the Future");
		
		
		
	}
	//metodos
	private void buscarPersona(String string) {
		// TODO Auto-generated method stub
		WebElement barBusqueda = driver.findElement(By.id("navbar-query"));
		barBusqueda.clear();
		barBusqueda.sendKeys("Back to the Future");
		
		
		//da click en entrar
		WebElement loginButton = driver.findElement(By.id("navbar-submit-button"));
		loginButton.click();
		
	}

	@After
	public void tearDown() {
		System.out.println("Tear Down");
		
	}
	

}
