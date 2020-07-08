package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/");
		
	//  Explicit wait for title	
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.titleIs("HubSpot Login")); Or
	//	wait.until(ExpectedConditions.titleContains("Login"));
		
	//  Explicit wait for particular element
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
		WebElement emailId = driver.findElement(By.id("username"));
		emailId.sendKeys("testing");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("HubSpot123@.");

		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		loginButton.click();
		
	//	System.out.println(driver.getTitle()); // now it work to resolve the avobe issues , it wait for ele 1st
		
		
		

	}

}
