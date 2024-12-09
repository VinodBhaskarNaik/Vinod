package basicScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script24 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://flipkart.com");
	       List<WebElement> url= driver.findElements(By.xpath("//a"));
		int count = url.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = url.get(i);
			String vinod = link.getAttribute("href");
			System.out.println(vinod);
		}
		Thread.sleep(1000);
		driver.quit();
			
		
	  }

}
