package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		System.out.println("the number of links is : " + linkList.size());
		
		Thread.sleep(5000);
		
		for (int i = 0; i < linkList.size(); i++) { 
			String text =linkList.get(i).getText();
			System.out.println(text);
			
			if (! text.isEmpty()) {
				System.out.println(i + "--->"+ text);
				System.out.println(linkList.get(i).getAttribute("href"));
				
				
			}
		}
	}

}
