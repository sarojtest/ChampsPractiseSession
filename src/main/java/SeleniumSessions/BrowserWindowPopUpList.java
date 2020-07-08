package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> handleList=new ArrayList<String>(handles);
		
		String parentWindowID=handleList.get(0);
		System.out.println(parentWindowID);
		String childWindowID=handleList.get(1);
		System.out.println(childWindowID);

	}

}
