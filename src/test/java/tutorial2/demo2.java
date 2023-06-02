package tutorial2;

import org.testng.annotations.Test;

public class demo2 {

	@Test(groups= {"ooo","ppp"},priority=3)
	public void abc()
	{
		System.out.println("abc");
	}
	
	@Test(groups="ooo",priority=2)
	public void first()
	{
		System.out.println("first");
	}
	
	@Test(groups="ppp", priority=4)
	public void pqr()
	{
		System.out.println("pqr");
	}
	
	@Test(groups="ooo",priority=5)
	public void xyz()
	{
		System.out.println("xyz");
	}
	
	@Test(groups="ooo", priority=6)
	public void last()
	{
		System.out.println("last");
	}
	
	@Test(groups="ppp",priority=7)
	public void down()
	{
		System.out.println("down");
	}
	
	@Test(groups={"ooo","ppp"},priority=1)
	public void up()
	{
		System.out.println("up");
	}
}
