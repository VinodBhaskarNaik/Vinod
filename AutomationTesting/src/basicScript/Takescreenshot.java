package basicScript;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot
{
	public static void main(String[] args) throws InterruptedException, IOException 
	  {
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.flipkart.com");
			Thread.sleep(2000);
			Date d=new Date();
			String d1=d.toString().replace(":", "-");
			System.out.println(d1);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp=ts.getScreenshotAs(OutputType.FILE);
			File perm=new File("./screenshot/Defect.png");
		    FileHandler.copy(temp, perm);
		    Thread.sleep(2000);
		    driver.quit();
		    
			
			
			
	  }
}
