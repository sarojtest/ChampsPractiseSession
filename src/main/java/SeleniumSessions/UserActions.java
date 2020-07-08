package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/");
		Thread.sleep(5000);
		
		// creating By locators
		By uname=By.id("username");
		By pwd = By.id("password");
		By logBtn = By.id("loginBtn");
		
//		WebElement username = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement logButton = driver.findElement(By.id("loginBtn"));
//		
//		Actions action = new Actions(driver);
//		action.sendKeys(username, "saroj2310@gmail.com").build().perform();
//		action.sendKeys(password, "HubSpot123@.").build().perform();
//		action.click(logButton).perform();

		CustomUtility cu = new CustomUtility(driver);
		cu.doActionsSendKeys(uname, "saroj2310@gmail.com");
		cu.doActionsSendKeys(pwd, "HubSpot123@.");
		cu.doClick(logBtn);


		

	}

}
