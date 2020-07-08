package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelect {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));

		Select select=new Select(day);
		select.selectByVisibleText("10");
	//	System.out.println(select.isMultiple());         // it will be false in this case
	
//		Select select1=new Select(month);
//		select1.selectByIndex(1);
//		
//		Select select2=new Select(year);
//		select2.selectByValue("1990");
		
		selectDropdown(day, "23");
		selectDropdown(month, "Oct");
		selectDropdown(year, "1988");
	
		getDropDownValues(month);
		getDropDownValues(month);
	}
	public static void selectDropdown(WebElement element , String value) {
		Select select=new Select(element);
        select.selectByVisibleText(value);
	}
	public static void selectDropdown(WebElement element , int index) {
		Select select=new Select(element);
        select.selectByIndex(index);
	}
	public static void getDropDownValues(WebElement element) {
		// retrieving all values ofdropdown
		Select select = new Select(element);
		List<WebElement>  optionsList=select.getOptions();
		System.out.println("total values in day dropDown is " +optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
		}
		
		
	}

}
