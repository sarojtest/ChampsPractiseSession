package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		// Alert javaScript alert
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		if (alertText.equals("Please enter a valid user name")) {
			System.out.println("correct error message");
		}else {
			System.out.println("in correct error message");
		}
		
		alert.dismiss();

	}

}
