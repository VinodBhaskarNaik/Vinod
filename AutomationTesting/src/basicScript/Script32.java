package basicScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script32 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.flipkart.com");
			Thread.sleep(2000);
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			int count=links.size();
			for(int i=count-1;i>=0;i--)
			{
				if(i%2==0)
				{
				WebElement link = links.get(i);
				String txt = link.getText();
				System.out.println(i+""+txt);
				}
			}
	  
			Thread.sleep(2000);
			driver.quit();
	  }
}
