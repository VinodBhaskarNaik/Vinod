package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Script6 
{
	@Test
	 public void signup()
     {
	  System.out.println("the signup page is diplayed");
     }
 
	  @Test
 public void login()
    {
//	 Assert.fail();
	 System.out.println("login is successfull");
    }
	  @Test
	  public void homepage()
	  {
		  System.out.println("home page should be displayed");
	  }
	  @Test
	  public void logout()
	  {
		  System.out.println("logout");
	  }
}
