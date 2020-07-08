package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		
		if (driver.getTitle().equals("Google")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("title is not correct");
		}
		
		driver.getCurrentUrl();
		if (driver.getCurrentUrl().contains("google")) {
			System.out.println("correct url");
			} else{
				System.out.println("incorrect url");
			}
			
		driver.quit();
		

	}

}
