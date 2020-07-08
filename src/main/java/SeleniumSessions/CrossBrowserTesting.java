package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	public static void main(String[] args) {
		String browser= "firefox";
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver= new SafariDriver();
		}
		else {
			System.out.println("browser not name : " + browser);
		}
		
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
