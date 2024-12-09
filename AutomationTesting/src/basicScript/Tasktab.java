package basicScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tasktab 
{
 public static void main(String[] args) throws AWTException, InterruptedException
 {
	 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		Robot r=new Robot();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement lin1 = driver.findElement(By.xpath("//a[@href='https://www.nuget.org/packages/Selenium.WebDriver'][1]"));
		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView()", lin1);
		ac.contextClick(lin1).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement lin2 = driver.findElement(By.xpath("//a[@href='https://rubygems.org/gems/selenium-webdriver/versions/4.26.0']"));
		ac.contextClick(lin2).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement lin3 = driver.findElement(By.xpath("//a[@href='https://pypi.python.org/pypi/selenium']"));
//		js.executeScript("arguments[0].scrollIntoView()", lin3);
		ac.contextClick(lin3).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement lin4 = driver.findElement(By.xpath("//a[@href='https://npmjs.org/package/selenium-webdriver']"));
		ac.contextClick(lin4).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		driver.quit();
     
     
  }
}
