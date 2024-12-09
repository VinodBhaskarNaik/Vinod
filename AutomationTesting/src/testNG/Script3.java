package testNG;

import org.testng.annotations.Test;

public class Script3 
{
    @Test(priority=0)
    public void signup()
    {
    	System.out.println("the signup page is diplayed");
    }
    @Test(priority=1)
    public void login()
    {
    	System.out.println(" login page is diplayed ");
    }
    @Test(priority=2)
    public void homepage()
    {
    	System.out.println("home page should be displayed");
    }
    @Test(priority=3)
    public void logout()
    {
    	System.out.println("logout");
    }
}
