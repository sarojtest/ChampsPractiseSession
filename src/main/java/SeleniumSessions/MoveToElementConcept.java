package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		Thread.sleep(5000);
		WebElement conteLink = driver.findElement(By.className("menulink"));
		Actions action = new Actions(driver);
		action.moveToElement(conteLink).build().perform(); // for 1 action build is not mandatory
		
		driver.findElement(By.linkText("COURSES")).click();
		
		
		
		
	}

}
