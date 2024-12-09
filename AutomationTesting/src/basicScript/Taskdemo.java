package basicScript;get

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskdemo
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			WebElement dd = driver.findElement(By.id("select-multiple-native"));
	        Select s=new Select(dd);
	        if(s.isMultiple())
	        	
       }
   }

