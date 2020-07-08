package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithByLocator {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		By day   = By.id("day");
		By month = By.id("month");
		By year  = By.id("year");
		
		ArrayList<String> dayList=selectDropdown(driver,day);
		System.out.println("total nuber of days is : " + dayList.size());
		System.out.println(dayList);
		
		ArrayList<String> monthList=selectDropdown(driver, month);
		System.out.println("total nuber of months is : " + monthList.size());
		System.out.println(monthList);

		ArrayList<String> yearList=selectDropdown(driver, year);
		System.out.println("total nuber of years is : " + yearList.size());
		System.out.println(yearList);
		
	}
	public static ArrayList<String> selectDropdown(WebDriver driver,By locator  ) {
		ArrayList<String> ar=new ArrayList<String>();
		CustomUtility customutility =new CustomUtility(driver);
		
		Select select=new Select(customutility.getElement(locator));
		List<WebElement>  optionsList=select.getOptions();
		for (int i = 0; i < optionsList.size(); i++) {
			ar.add(optionsList.get(i).getText());
		}
		return ar;
		
	}

}
