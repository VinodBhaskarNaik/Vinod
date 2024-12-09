package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Script7 
{
  public WebDriver driver;
  @Parameters("BrowserName")
  @BeforeMethod
  public void browserLaunch(String BrowserName)
  {
	  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  
	  if(BrowserName.equals("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  else if(BrowserName.equals("Firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
  }  
 
  @AfterMethod
	  public void classBrowser() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  driver.quit();
	  }	  
  }

