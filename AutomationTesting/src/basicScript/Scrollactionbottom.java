package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollactionbottom 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(2000);
//		WebElement usn = driver.findElement(By.xpath("//a[@title='Brand Directory']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView()");
//		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	  }
}
