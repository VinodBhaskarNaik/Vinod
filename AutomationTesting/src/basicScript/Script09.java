package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script09 
{
  public static void main(String[] args)
  {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20Pc/Desktop/selenium/facebok.html");
		WebElement ele=driver.findElement(By.tagName("a"));
		ele.click();
  }
}
