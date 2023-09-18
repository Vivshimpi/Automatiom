package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipcartTest() 
  
 {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\Chrome\\chromedriver-win32\\chromedriver.exe" );
	  Reporter.log("opening flipkart", true);
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com");
	  driver.manage().window().maximize();
	  driver.quit();
  }
}
