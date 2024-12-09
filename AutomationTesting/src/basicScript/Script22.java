package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22
{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://facebook.com");
	WebElement usn = driver.findElement(By.id("email"));
	Point loc=usn.getLocation();
	System.out.println(loc);
	
	
  }
}
