package testNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Script5 
{
	@Test
	
  public void signup()
      {
	  System.out.println("the signup page is diplayed");
      }
  
	  @Test(dependsOnMethods = "signup")
  public void login()
     {
      Assert.fail();
	 System.out.println("login is successfull");
     }
	  @Test(dependsOnMethods = "login")
	  public void homepage()
	  {
		  System.out.println("home page should be displayed");
	  }
	  @Test(dependsOnMethods = "homepage")
	  public void logout()
	  {
		  System.out.println("logout");
	  }
  
}
