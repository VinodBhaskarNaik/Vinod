package testNG;

import org.testng.annotations.Test;

public class Script4 
{
	 @Test
	    public void signup()
	    {
	    	System.out.println("the signup page is diplayed");
	    }
	    @Test
	    public void login()
	    {
	    	System.out.println(" login page is diplayed ");
	    }
	    @Test(enabled = false)
	    public void homepage()
	    {
	    	System.out.println("home page should be displayed");
	    }
	    @Test(enabled = false)
	    public void logout()
	    {
	    	System.out.println("logout");
	    }
}
