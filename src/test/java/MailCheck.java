import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MailCheck {
	protected WebDriver webDriver;

	@BeforeMethod
	public void setup() {
		//setChromeDriver();
		webDriver = new FirefoxDriver();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void tearDown() {
		webDriver.quit();
	}

	@Test
	public void mailChecker() throws IOException, InterruptedException {
		webDriver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&passive=1209600&acui=1#Email=testmm1616%40gmail.com");
		String password = "test1122";
		//Actions seleniumActions = new Actions(webDriver);
		webDriver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys(password);
		webDriver.findElement(By.xpath("//input[@id='signIn']")).click();
		
		Thread.sleep(10000);

		
	
		
	}
		

	
}
