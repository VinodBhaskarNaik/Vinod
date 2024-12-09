package basicScript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scrpit33 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	   {
	    System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/My%20Pc/Desktop/selenium/dropdown.html");
		WebElement dd = driver.findElement(By.id("Celebrities"));
		Select s=new Select(dd);
		if(s.isMultiple())
		{
		System.out.println("the drop down is multiple selected");	
		
		}
		else
		{
			System.out.println("the drop down is single selected");	
			
		}
		Thread.sleep(2000);
		driver.quit();
		}
}
