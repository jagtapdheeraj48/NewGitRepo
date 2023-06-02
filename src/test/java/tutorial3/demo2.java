package tutorial3;

import org.testng.annotations.Test;

public class demo2 {
    @Test(groups={"new", "modern"}) 
	public void login()
	{
		System.out.println("new: modern");
	}
    @Test(groups = "old")
	public void home()
	{
		System.out.println("old: home");
	} 
    @Test(groups = "latest")
	public void serach()
	{
		System.out.println("latest: search");
	}
    @Test(groups = "classic")
	public void admin()
	{
		System.out.println("regression testing: admin");
	}

}
