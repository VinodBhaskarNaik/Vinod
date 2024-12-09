package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Task 
{
  @Test
  public void testcase() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.facebook.com");
	  Thread.sleep(2000);
	  WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
	  usn.sendKeys("vinod");
	  Thread.sleep(2000);
	  WebElement pwd = driver.findElement(By.id("pass"));
	  pwd.sendKeys("vinod@6678");
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  usn.sendKeys("vinod");
	  Thread.sleep(2000);
	  pwd.sendKeys("vinod@6678");
	  Thread.sleep(2000);
	  driver.quit();
  }
  
 
  
}
