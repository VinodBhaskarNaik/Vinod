package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script16 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to("file:///C:/Users/My%20Pc/Desktop/selenium/diabled.html");
			 WebElement cb=driver.findElement(By.xpath(" (//input[@type='checkbox'])"));
			if(cb.isDisplayed())
		    {
				if(cb.isEnabled())
			  {
			    if(cb.isSelected())		
			
			    {
			    	System.out.println("it is selected");
			    	cb.clear();
			    	
			     }
			    else
			    {
				System.out.println("it is not selected");
			    }
		    }
			else
			{
				System.out.println("it is disabled");
			}
	  }
			else
			{
			System.out.println("it is not displayed");	
			}
			Thread.sleep(3000);
			driver.quit();
			}

}
