package Selenium_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class_for_All.Base_class;

public class Browser_Launch extends Base_class {
	 
	public static WebDriver driver;
	
	 public static void main(String[] args) {
		
		 
		driver=Browser_Launch("chrome");
		 
		 getUrl("https://www.amazon.in/");
		 
		navigate("to", "https://www.facebook.com/");
		 
	     //	navigate("t,","back");
		 
	  //  navigate("to","forward"); 
		 
		//navigate("to","refresh"); 
		 
		 
		 
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
	
	
	
	
	
	
	
	
	
	
	

