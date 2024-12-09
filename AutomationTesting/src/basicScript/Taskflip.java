package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Taskflip 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.click();
		search.sendKeys("iphone11");
		WebElement clsearch = driver.findElement(By.xpath("//button[@type='submit']"));
		clsearch.click();
		WebElement iphone = driver.findElement(By.xpath("//img[@class='DByuf4']"));
		iphone.click();
//		WebElement cart= driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']"));
//		cart.click();
		WebElement lgn = driver.findElement(By.xpath("//a[@class='wsejfv']"));
		lgn.click();
		
  }
}
