package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandlingPart_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
		String dob ="10-Jan-1990";	
		selectDropDownValue(day, dob.split("-")[0]);	
		selectDropDownValue(month,dob.split("-")[1]);
		selectDropDownValue(year, dob.split("-")[2]);
			
		

	}
	public static void selectDropDownValue(WebElement element, String value) {
		Select select =new Select(element);
		List<WebElement> valuesList=select.getOptions();
		for (int i = 0; i <valuesList.size(); i++) {
			if (valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;
		
	}

}
}
}
