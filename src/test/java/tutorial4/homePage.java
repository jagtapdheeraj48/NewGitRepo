package tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseLayer.baseClass;

public class homePage extends baseClass  {

	
	@Test(priority=1)
	public void serach() throws InterruptedException
	{  baseClass.begin();
	driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@class='_1fiQt']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void nonVeg() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.navigate().refresh();
    	 driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys("chicken");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).click();

//		driver.findElement(By.xpath("//section[@class='sc-w2q7gn-1 dCEJxz carousel-content'][6]/div/div/div/div/div/img")).submit();
//	    driver.findElement(By.xpath("//div[@class='sc-1mo3ldo-0 sc-esoVGF ctnNZw'][3]/div/div[2]/div")).click();
//	   String v= driver.findElement(By.xpath("//h1[text()])")).getText();
//	    System.out.println(v);
//	    driver.navigate().back();
//	    driver.navigate().back();
	}
	
//	@Test(priority=3)
	public void veg()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("veg");
		driver.findElement(By.xpath("//div[@class=\"sc-eMRERa jGiUPa\"][3]")).click();
		driver.findElement(By.xpath("//div[@class=\"sc-1mo3ldo-0 sc-fHeoTs fFUiiL\"][3]/div/div[3]/div")).click();
        String j=driver.findElement(By.xpath("//h1[text()]")).getText();
        System.out.println(j);
	}
}
