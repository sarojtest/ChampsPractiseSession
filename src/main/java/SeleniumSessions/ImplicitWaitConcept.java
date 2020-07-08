package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //It is global $ dynamic wait and applied on all webelements and if is found rest times are ignored.
		driver.get("https://app.hubspot.com/login/");
		
		//driver.getTitle(); will give incorrect title since it cant wait for title as its an webelement
		
		//Thread.sleep(5000);  // It is static wait wait till pre/post action on page reqd.pauses the script
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		emailId.sendKeys("saroj2310@gmail.com");
		System.out.println(driver.getTitle()); // now it work to resolve the avobe issues , it wait for ele 1st
		password.sendKeys("HubSpot123@.");
		loginButton.click();
		
		
	}

}
