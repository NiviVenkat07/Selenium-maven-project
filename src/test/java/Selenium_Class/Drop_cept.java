package Selenium_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Base_class_for_All.Base_class;

public class Drop_cept extends Base_class {
   
	public static WebDriver driver ;
	
	public static void main(String[] args) {
		
		driver=Browser_Launch("chrome");
		
		getUrl("https://www.ironspider.ca/forms/dropdowns.htm");
		
		
		
	 WebElement C = driver.findElement(By.name("coffee2"));
		
		Select C1 = new Select (C);
		
		boolean multiple =C1.isMultiple();
		 System.out.println(multiple);
		
		 C1.selectByValue("skim");
		 C1.selectByValue("milk2");
		 C1.selectByValue("whipped");
		 
	WebElement ab =	C1.getFirstSelectedOption();
		System.out.println(ab.getText());
	
	
	List<WebElement> li =C1.getAllSelectedOptions();	
	for (WebElement l2 : li) {
		System.out.println(l2.getText());
	}	
		
	List<WebElement> s1 =C1.getOptions();	
	for (WebElement options : s1) {
		System.out.println(options.getText());
	}	
		
		
		
		
		
		
		
	}
	
	
	
}
