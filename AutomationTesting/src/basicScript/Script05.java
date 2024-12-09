package basicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.get("https://www.netflix.com");
	 Thread.sleep(2000);
	 String title = driver.getTitle();
	 System.out.println(title);
	 Thread.sleep(2000);
	 driver.quit();
	 
  }
}
