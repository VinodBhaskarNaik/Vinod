package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script18 
{
	public static void main(String[] args) 
	  {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com");
			WebElement ele=driver.findElement(By.id("email"));
			String tn=ele.getTagName();
			System.out.println(tn);
			driver.quit();
			
	  }
}
