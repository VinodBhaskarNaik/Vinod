package basicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script06
{
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.netflix.com");
	Thread.sleep(2000);
	String src = driver.getPageSource();
	Thread.sleep(2000);
	System.out.println(src);
	driver.quit();
  }
}
