package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowID = it.next();
		System.out.println("parentWindowID is "+parentWindowID);
		
		String childNextWindowID=it.next();
		System.out.println("childWindowID is "+childNextWindowID);
		
		driver.switchTo().window(childNextWindowID);
		System.out.println("childNextWindowId title is : "+ driver.getTitle());
		
		driver.close();// window window closed and driver lost
		driver.switchTo().window(parentWindowID);
		// to check we validate the title once more
		System.out.println("parentWindowId title is : "+ driver.getTitle());
	}

}
