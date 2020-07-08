package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelectClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
		String dob ="23-Oct-1990";
		
		String dayOptionsXpath = "//Select[@id='day']/option";
		String monthOptionsXpath = "//Select[@id='month']/option";
		String yearOptionsXpath = "//Select[@id='year']/option";
		
		doSelectValueFromWithoutSelectmethod(driver, "xpath" , dayOptionsXpath, dob.split("-")[0]);
		doSelectValueFromWithoutSelectmethod(driver, "xpath" , monthOptionsXpath, dob.split("-")[1]);
		doSelectValueFromWithoutSelectmethod(driver, "xpath" , yearOptionsXpath, dob.split("-")[2]);


		String dayoptionCss    = "select#day option";
		String monthoptionCss  = "select#month option";
		String yearoptionCss   = "select#year option";
		
		doSelectValueFromWithoutSelectmethod(driver, "css" ,  dayoptionCss, dob.split("-")[0]);
		doSelectValueFromWithoutSelectmethod(driver, "css" ,  monthoptionCss, dob.split("-")[1]);
		doSelectValueFromWithoutSelectmethod(driver, "css" ,  yearoptionCss, dob.split("-")[2]);

	}
	public static void doSelectValueFromWithoutSelectmethod(WebDriver driver,String locator,String locatorvalue ,String value) {
		List<WebElement> valuesList = null;
		
		if (locator.equals("xpath")) {
			 valuesList=driver.findElements(By.xpath(locatorvalue));
			 
		}else if (locator.equals("css")) {
			valuesList=driver.findElements(By.cssSelector(locatorvalue));
		}
		
		 
		System.out.println(valuesList.size());
		
		for (int i = 0; i <valuesList.size(); i++) {
			if (valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;
			}	
	}
		
	}
	
		
	
	
}
			
		
		

	