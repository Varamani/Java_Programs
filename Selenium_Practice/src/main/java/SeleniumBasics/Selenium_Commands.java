package SeleniumBasics;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Selenium_Commands {
	
	
	@Test
	public void setUp() throws InterruptedException, IOException, AWTException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hussain\\eclipse-workspace\\Selenium_Practice\\src\\main\\resources\\Drivers\\FireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		driver.get("https://www.grammarly.com/plagiarism-checker");
		
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(2000);
	    
	     driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div[2]/form/div/div[4]/button[2]/span")).click();
	
	    Thread.sleep(2000); 
	    
	    Runtime.getRuntime().exec("C:\\Users\\Hussain\\Desktop\\FileUpload.exe");
	 
	   /* // creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Hussain\\Desktop\\path.txt");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    Thread.sleep(5000); 
	    
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);*/
		
	}
	


}

