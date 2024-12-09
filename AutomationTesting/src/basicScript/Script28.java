package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script28 
{
	public static void main(String[] args) throws InterruptedException
	{
		

	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/My%20Pc/Desktop/selenium/fianl.html");
	WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys("admin");
	Thread.sleep(2000);
	WebElement f2= driver.findElement(By.xpath("//iframe[@id='f2']"));
	driver.switchTo().frame(f2);
	WebElement psw= driver.findElement(By.xpath("//input[@type='text']"));
	psw.sendKeys("admin@123");
	
	}
}
