package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuereyDropDownhandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
	//	selectChoicevalues(driver, "choice 7");
	//	selectChoicevalues(driver, "choice 2", "choice 7" ,"choice 6 2 3");
		selectChoicevalues(driver, "ALL");

	
	}
	public static void selectChoicevalues(WebDriver driver ,String... value) {
		
		List<WebElement> choiceList=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		if (! value[0].equalsIgnoreCase("All")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text =choiceList.get(i).getText();
				System.out.println(text);
				
				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
				         break;
					}
				}
				
			}
			
		}
		// select all the values
		else {
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	}

}
