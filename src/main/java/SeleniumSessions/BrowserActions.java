package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {
	WebDriver driver;
	
	public WebDriver launchBrowser(String browser) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
			
		default:
			System.out.println("broswer not found : " + browser);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	public void launchUrl(String url) {
		driver.get(url);
		
	}
	public String doGetTitle() {
		driver.getTitle();
		return driver.getTitle();
	}
	
	public void quitBrowse() {
		driver.quit();
		
	}

}
