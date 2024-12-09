package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Script8 
{
    @Test
    public void signup() throws InterruptedException
    {
    	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
    	WebDriver driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	driver.get("https://www.facebook.com");
    	Thread.sleep(2000);
    	String ExpectedTitle="Facebook-login or signup";
    	String ActualTitle=driver.getTitle();
    	Assert.assertEquals(ActualTitle, ExpectedTitle);
    	System.out.println(ActualTitle);
    	driver.quit();
    			
    			
    }
}
