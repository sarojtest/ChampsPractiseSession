package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/");
		
		By emailId = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		getElementWithWait(driver, emailId, 6).sendKeys("saroj2310@gmail.com");
		driver.findElement(password).sendKeys("HubSpot123@.");
		driver.findElement(loginBtn).click();
		
		
	}
	
	public static  WebElement getElementWithWait(WebDriver driver, By locator , int timeout) {
		WebElement element = null;
		for (int i = 0; i <timeout; i++) {
			
			try {
				element=driver.findElement(locator);
				break ;
			} 
			catch (Exception e) {
				System.out.println("Waiting for element to be present on page" + i + "secs");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
		return element;
	}

}
