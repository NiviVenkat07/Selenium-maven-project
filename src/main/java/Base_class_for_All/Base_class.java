package Base_class_for_All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {

	public static WebDriver driver;
	
	public static WebDriver Browser_Launch(String type) {
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");

			 driver = new ChromeDriver();
	}
		else if (type.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+ "\\driver\\Firefoxdriver.exe");

				 driver = new FirefoxDriver();	
			
			
		}
		
		driver.manage().window().maximize();
		
		   return driver;
		
	}
           public static void getUrl(String Url) {
		         driver.get(Url);

	}
	
	 
	            public static void navigate(String type , String String ) {
	             if (type.equalsIgnoreCase("to")) {
	                  	driver.navigate().to(String);
	}
	             else if (type.equalsIgnoreCase(String)) {
		                driver.navigate().back();
	}
	              else if (type.equalsIgnoreCase(String)) {
		              driver.navigate().forward();
	}
   	               else if (type.equalsIgnoreCase(String)) {
		              driver.navigate().refresh();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	}
}
