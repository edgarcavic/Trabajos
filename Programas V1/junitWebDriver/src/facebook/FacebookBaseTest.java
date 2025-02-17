package facebook;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;
import utils.Properties;

public class FacebookBaseTest {
	
	protected WebDriver driver;
	//se agrego despues
	protected WebDriverWait wait;
	//
	
	protected void setUp(String browser, String url) {
		System.out.println("Arranca el browser porfa y navega a la pagina.");
		System.setProperty("webdriver.chrome.driver","C:\\test_automation\\drivers\\chromedriver.exe");
		//la linea de abajo se agrego despues
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//la linea de abajo se agrego despues
		wait = new WebDriverWait(driver, Properties.LONG_WAIT);
	}
	
	@After
	public void tearDown() {
		System.out.println("Destruye la configuracion");
		driver.quit();
	}
	
	protected void likeAllPhotos() {
		// TODO Auto-generated method stub
		
	}

	protected void gotoPhotos() {
		// TODO Auto-generated method stub
		
	}

	protected void searchFacebookFriend(String friendName) {
		// TODO Auto-generated method stub
		
	}

	protected void logIntoFacebook(String user, String password) {
		// TODO Auto-generated method stub
		WebElement userField = driver.findElement(Locators.USER_FIELD_LOCATOR);
		WebElement passField = driver.findElement(Locators.PASSWORD_FIELD_LOCATOR);
		WebElement loginBtn = driver.findElement(Locators.LOGIN_BUTTON_LOCATOR);
		/*
		WebElement userField = driver.findElement(By.id("email"));
		WebElement passField = driver.findElement(By.id("pass"));
		WebElement loginBtn = driver.findElement(By.id("loginbutton"));
		*/
		
	}
	protected void failLoginIntoFacebook(String user, String password) {
		WebElement userField = driver.findElement(Locators.USER_FIELD_LOCATOR);
		WebElement passField = driver.findElement(Locators.PASSWORD_FIELD_LOCATOR);
		WebElement loginBtn = driver.findElement(Locators.LOGIN_BUTTON_LOCATOR);
	}

}
