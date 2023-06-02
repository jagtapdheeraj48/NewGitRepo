package tutorial2;

import org.testng.annotations.Test;

public class demo1 {
    @Test(groups = "regression testing")
	public void login()
	{
		System.out.println("regression testing: login");
	}
    @Test(groups = "smoke testing")
	public void home()
	{
		System.out.println("smoke testing: home");
	} 
    @Test(groups = "sanity testing")
	public void serach()
	{
		System.out.println("sanity testing: search");
	}
    @Test(groups = "regression testing")
	public void admin()
	{
		System.out.println("regression testing: admin");
	}
}
