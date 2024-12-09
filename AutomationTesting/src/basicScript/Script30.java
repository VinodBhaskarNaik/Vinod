package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script30
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	Thread.sleep(2000);
	WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
	driver.switchTo().frame(frame1);
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.tagName("input"));
	email.click();
	email.sendKeys("Vinod");
	Thread.sleep(2000);
	WebElement psw = driver.findElement(By.id("password"));
	psw.sendKeys("Qspider1@23");
	Thread.sleep(2000);
	WebElement cpsw = driver.findElement(By.id("confirm-password"));
	cpsw.sendKeys("Qspider1@23");
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
	driver.switchTo().frame(frame2);
	Thread.sleep(2000);
	WebElement username = driver.findElement(By.id("username"));
	username.click();
	username.sendKeys("Vinod");
	Thread.sleep(2000);
	WebElement pas = driver.findElement(By.id("password"));
	pas.sendKeys("Qspider1@23");
	Thread.sleep(2000);
	driver.quit();
	}
}
