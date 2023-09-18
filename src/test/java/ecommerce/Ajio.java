package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTest() 
  {
	  System.setProperty("webdriver.chrome.driver",
	"E:\\Chrome\\chromedriver-win32\\chromedriver.exe" );
	  Reporter.log("opening ajio ", true);
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ajio.com");
	  driver.manage().window().maximize();
	  driver.quit();
  }
}
