package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPageTest {
	
	// By locators ----PageObjects
		static	By emailId = By.id("username");
		static	By password = By.id("password");
		static	By loginButton = By.id("loginBtn");
		static	By signUpLink = By.linkText("Sign up");
		static By homepageHeader = By.className("dashboard-selector__title");
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserActions bra = new BrowserActions();
		WebDriver driver= bra.launchBrowser("chrome");
		bra.launchUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		CustomUtility utility= new CustomUtility(driver);
//		utility.getElement(emailId).sendKeys("saroj2310@gmail.com");
//		utility.getElement(password).sendKeys("HubSpot123@.");
//		utility.getElement(loginButton).click();
		
		utility.doSendKeys(emailId, "saroj2310@gmail.com");
		utility.doSendKeys(password, "HubSpot123@.");
		utility.doClick(loginButton);
		
		Thread.sleep(5000);
		utility.doGetText(homepageHeader);
		String header = utility.doGetText(homepageHeader);
		System.out.println("homepage header is " + header);
		
		if (header.equals("Sales Dashboard")) {
			System.out.println("User has loggin Successfully");
		}else {
			System.out.println("Header not correct");
		}
		System.out.println("title of the page is " + bra.doGetTitle()
		);

		


		
	}

}
