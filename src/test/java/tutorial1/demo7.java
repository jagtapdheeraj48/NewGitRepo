package tutorial1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo7 {

	
	
		@BeforeTest
		public void beforeTest() {
			System.out.println("BeforeTest");
			System.out.println("...................");
		}
		
		@AfterTest
		public void AfterTest() {
			System.out.println("afterTest");
		}
		
	
		
		@Test(priority=2)
		public void ooo() {
				System.out.println("ooo");
			}
	    @Test(priority=1)
		public void xxx() {
			System.out.println("xxx");
	     }
	    
		
		@Test(priority=-10)
		public void vvv() {
			
			System.out.println("vvv");
	}
	}


