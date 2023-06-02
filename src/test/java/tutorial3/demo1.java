package tutorial3;

import org.testng.annotations.Test;

public class demo1 {

	@Test(groups="classic")
	public void login()
	{
		System.out.println("classic: login");
	}
    @Test(groups = "vintage")
	public void home()
	{
		System.out.println("vintage: home");
	} 
    @Test(groups = "modern")
	public void serach()
	{
		System.out.println("modern: search");
	}
    @Test(groups = "classic")
	public void admin()
	{
		System.out.println("classiic: admin");
	}

}
