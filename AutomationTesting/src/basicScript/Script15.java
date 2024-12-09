package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script15 
{
  public static void main(String[] args) 
  {
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/My%20Pc/Desktop/selenium/diabled.html");
		 WebElement usn=driver.findElement(By.xpath(" (//input[@type='text'])[1]"));
		if(usn.isDisplayed())
	    {
			if(usn.isEnabled())
		
		    {
			usn.sendKeys("admin");
		     }
		    else
		    {
			System.out.println("usn is disabled");
		    }
	    }
		else
		{
			System.out.println("usn is displayed");
		}
  }
}
