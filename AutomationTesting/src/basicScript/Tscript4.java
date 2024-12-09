package basicScript;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tscript4
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	 driver.findElement(By.id("browserButton2")).click();
	 String p_browsers= driver.getWindowHandle();
	 Set<String> wins = driver.getWindowHandles();
	 ArrayList<String> arr=new ArrayList<String>(wins);
     int count = arr.size();
     for(int i=0;i<count;i++)
     {
    	 String win = arr.get(i);
    	 driver.switchTo().window(win);
    	 String title = driver.getTitle();
    	 System.out.println(title);
    	 if(win.equals(p_browsers))
    	 {
    		 driver.close();
    	 }
     }
	 
	}
}
