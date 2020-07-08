package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		CustomUtility util = new CustomUtility(driver);
		
		By emailId = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By signUp   = By.linkText("Sign up");
		

		
		driver.get("https://app.hubspot.com/login/");
		
		util.clickWhenReady(signUp, 6);
		
//		String title= util.waitForTitleToBePresent("Login", 6);
//		System.out.println(title);
//		
//		
//		util.waitForElementToBePresent(emailId, 5).sendKeys("saroj2310@gmail.com");
//		util.doSendKeys(password, "HubSpot123@.");
//		util.doClick(loginBtn);
//
//		
	}

}
