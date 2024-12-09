package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task4 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
			Thread.sleep(2000);
			 WebElement button=driver.findElement(By.xpath(" (//a [@href='/ui/button'])"));
			 button.click();
			 Thread.sleep(2000);
			 WebElement in1=driver.findElement(By.xpath(" (//button [@id='btn'])"));
			 in1.click();
			 Thread.sleep(2000);
			 WebElement in2=driver.findElement(By.xpath("//button[@ id='btn2']"));
			 in2.click();
			 Thread.sleep(2000);
			 WebElement in3=driver.findElement(By.xpath(" (//button [@id='btn4'])"));
			 in3.click();
			 Thread.sleep(2000);
			 WebElement in4=driver.findElement(By.xpath(" (//button [@id='btn5'])"));
			 in4.click();
			 Thread.sleep(2000);
			// WebElement in5=driver.findElement(By.xpath("//button[@ id='btn6']"));
			 //in5.click();
			 //Thread.sleep(2000);
      }
}
