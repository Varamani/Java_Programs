package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumPractics {
	
	@Test(groups="A")
	public void SeleniumBasics()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hussain\\eclipse-workspace\\Selenium_Practice\\src\\main\\resources\\Drivers\\FireFox\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("https://www.facebook.com");
	    
	    System.out.println(driver.getTitle());
	}

}
