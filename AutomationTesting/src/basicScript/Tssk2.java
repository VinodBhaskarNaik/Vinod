package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tssk2 
{
 public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	WebElement sea = driver.findElement(By.cssSelector("input[id='search']"));
	sea.click();
	
	sea.sendKeys("kgf title track");
	WebElement sea_icon=driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
	sea_icon.click();;
 }
}
