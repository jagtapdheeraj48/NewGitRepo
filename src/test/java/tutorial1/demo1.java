package tutorial1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo1 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Beforeclass");
		System.out.println("...................");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("afterClass");
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("afterMethod");
		System.out.println("...................");
	}
	@Test(priority=2)
	public void abc() {
			System.out.println("abc");
		}
    @Test(priority=1)
	public void xyz() {
		System.out.println("xyz");
     }
    
	@Test(enabled=false)
	public void pqr() {
		System.out.println("pqr");
		}
	@Test(priority=-10)
	public void opm() {
		
		System.out.println("opm");
}
}
