package basicScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("file:///C:/Users/My%20Pc/Desktop/selenium/checboxtask.html");
			Thread.sleep(2000);
		    List<WebElement> cb = driver.findElements(By.xpath("//input"));
		    int count = cb.size();
		    for(int i=1;i<count;i=i+2)
		    {
		    	WebElement check = cb.get(i);
		    	check.click();
		    }
		    Thread.sleep(2000);
		    for(int j=count-1;j>=0;j=j-2)
	    	{
		    	WebElement check = cb.get(j);
		    	check.click();
	    	}
	    	
		 Thread.sleep(2000);
		 driver.quit();
	  }
}
