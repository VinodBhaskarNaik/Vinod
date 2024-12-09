package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script19 
{
	public static void main(String[] args) 
	  {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com");
			WebElement ele=driver.findElement(By.id("email"));
			String val=ele.getCssValue("background-color");
			System.out.println(val);
			String val1=ele.getCssValue("font-family");
			System.out.println(val1);
			driver.quit();
			
	  }

}
