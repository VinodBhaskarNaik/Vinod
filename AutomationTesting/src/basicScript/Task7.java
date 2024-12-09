package basicScript;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Task7 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	  {
		  System.setProperty("webdriver.chrome.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.amazon.com");
			Thread.sleep(2000);
			List<WebElement> links = driver.findElements(By.xpath("//img"));
			int fli=links.size();
            for(int i=0;i<fli;i++)
            {
            	WebElement f = links.get(i);
            	File temp = f.getScreenshotAs(OutputType.FILE);
            	File perm = new File("./screenshot/"+i+"amazon.png");
            	FileHandler.copy(temp, perm);
            	Thread.sleep(2000);
    		    driver.quit();
            }
			
	  }
}
