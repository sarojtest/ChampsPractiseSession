package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefException {

	public static void main(String[] args) {

		    WebDriverManager.chromedriver().setup();
		    
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://classic.crmpro.com/");
			
			WebElement username=driver.findElement(By.name("username"));
			username.sendKeys("saroj2310@gmail.com");
			
			driver.navigate().refresh();
			// again we have to pass the same element to avoid stale element refernce exception
			username=driver.findElement(By.name("username"));
			username.sendKeys("naveen123");
			
			
	}

}
