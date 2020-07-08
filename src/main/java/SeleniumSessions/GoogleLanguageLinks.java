package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			
			List<WebElement> linkList=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			System.out.println(linkList.size());
			
			for (int i = 0; i < linkList.size(); i++) {

				String text=linkList.get(i).getText();
				System.out.println(text);
				linkList.get(i).click();
				linkList=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
				
			
				
			}
			
	}

}
