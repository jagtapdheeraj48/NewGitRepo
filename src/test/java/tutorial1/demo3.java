package tutorial1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo3 {
	@Test(priority=1)
	public void loginFunctionality() {
		System.out.println("loginFunctionality");
	}
	@Test(dependsOnMethods= {"loginFunctionality"})
	public void homeFunctionality() {                                               //hard depends on method
		System.out.println("homeFunctionality");                               //dependsOnMethod= {"method name"}
		                                                                           
		                                                                               // soft depends on method
		                                                                       //dependsOnMethod= {"method name"},alwaysRun=true
	}
	@Test()
	public void pimFunctionality() {
		Assert.assertEquals("neo", "abs");
	}
	@Test(dependsOnMethods= {"pimFunctionality"})
	public void logotfunctionality() {
		System.out.println("logoutFunctionality");
	}

	@Test(dependsOnMethods= {"pimFunctionality"},alwaysRun=true)
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
}
