package tutorial1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.baseClass;
import pageLayer.loginPage;

public class demo6 extends baseClass{
	
	private loginPage obj= new loginPage();
	
	@BeforeMethod 
	public void setUp() {
	baseClass.initialzation();
	obj.loginFunctionality("8108428508", "9322257830");
	}
	@Test(priority=1)
	public void homePage() {
		
		boolean logoStatus=driver.findElement(By.xpath("//a[@aria-label='Facebook']")).isDisplayed();
		Assert.assertEquals(logoStatus, true);
		driver.findElement(By.xpath("//a[@aria-label=\"Gaming\"]")).click();
	}
	@Test(priority=2)
	public void marketPlace() throws InterruptedException {
		
	   driver.findElement(By.xpath("//a[@aria-label='Marketplace']")).click();
	   Thread.sleep(2000);
	   boolean shopping= driver.getTitle().contains("Marketplace");
	   Assert.assertEquals(shopping, true);
	   
	   driver.findElement(By.xpath("//span[contains(@class,'m x1qq9wsj')]")).click();
	   Thread.sleep(2000); 
	   String ProductName= driver.findElement(By.xpath("//input[@value=\"Pune, Maharashtra\"]")).getAttribute("value");
	   Assert.assertEquals(ProductName, "Pune, Maharashtra"); 
	   	
	}
	@AfterMethod 
	public void tearDown() {
    driver.quit();
	}
	
	
}
