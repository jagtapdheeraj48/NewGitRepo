package tutorial3;

import org.testng.annotations.Test;

public class demo3 {

	@Test(groups="vintage")
	public void login()
	{
		System.out.println("vintage: login");
	}
    @Test(groups = "classic")
	public void home()
	{
		System.out.println("classic: home");
	} 
    @Test(groups = "latest")
	public void serach()
	{
		System.out.println("latest: search");
	}
    @Test(groups = "latest")
	public void admin()
	{
		System.out.println("latest: admin");
	}

}
