package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script26 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/My%20Pc/Desktop/selenium/cutpaste.html");
		 WebElement usn = driver.findElement(By.xpath("//input[@value='vinod'])"));
		 Thread.sleep(2000);
		 usn.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 usn.sendKeys(Keys.CONTROL+"x");
		 Thread.sleep(1000);
		 WebElement conn = driver.findElement(By.xpath("//input[@value='vinod'])"));
		 conn.sendKeys(Keys.CONTROL+"v");
		 Thread.sleep(1000);
		 
		 
  }
}
