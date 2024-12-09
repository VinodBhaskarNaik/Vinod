package basicScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tscript2 
{
	 public static void main(String[] args) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
			WebElement but = driver.findElement(By.id("browserButton2"));
			but.click();
			Set<String> wins = driver.getWindowHandles();
			for(String win:wins)
			{
				System.out.println(win);
			}
			driver.quit();
	  }
}
