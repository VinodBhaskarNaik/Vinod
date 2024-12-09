package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Script27frame 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20Pc/Desktop/selenium/frame1.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		WebElement f1= driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f1);
		WebElement pwd= driver.findElement(By.xpath("//input[@type='text']"));
		pwd.sendKeys("admin");
  }
}
