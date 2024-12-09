package basicScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TScript
{
	 public static void main(String[] args) throws InterruptedException
	  {
		  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
			WebElement but = driver.findElement(By.id("browserButton2"));
			but.click();
			Thread.sleep(2000);
			Set<String> wins = driver.getWindowHandles();
			int count = wins.size();
			System.out.println(count);
//			Thread.sleep(2000);
//			driver.quit();
	  }
}
