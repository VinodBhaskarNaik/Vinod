package basicScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup1 
{
  public static void main(String[] args) throws InterruptedException 
     {
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[@id='buttonAlert1']"));
		ele.click();
	    Alert popup = driver.switchTo().alert();
	    popup.sendKeys("yes");
//	    popup.accept();
//	    popup.dismiss();
	    String msg = popup.getText();
	    System.out.println(msg);
	    Thread.sleep(2000);
	    driver.quit();
     }
}
