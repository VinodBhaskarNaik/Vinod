package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Diabledelement 
{
public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/My%20Pc/Desktop/selenium/disabled.html");
	WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("arguments[0].value=' '",usn);
	Thread.sleep(2000);
  }
}
