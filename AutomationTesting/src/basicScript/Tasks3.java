package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasks3 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/maps/dir///@12.9982998,77.5468183,15.92z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
	  WebElement sea=driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd' ]"));
	  sea.click();
	  WebElement fro=driver.findElement(By.xpath("//input[@aria-autocomplete='list'and @placeholder='Choose starting point, or click on the map...']"));
	  fro.sendKeys("Rajajinagara");
	  WebElement to=driver.findElement(By.xpath("//input[@aria-label='Choose destination...']"));
	  to.sendKeys("Murdeshwar");
	  
	}
  
  
}
