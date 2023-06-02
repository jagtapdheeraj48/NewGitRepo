package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class edgeDemo {

	@Test
	public void LoginWithEdge() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\DheerAj\\Downloads\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("csdvsds");
		driver.findElement(By.xpath("//input[@id='pass' ]")).sendKeys("546516");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();	
		//driver.findElement(By.xpath("//button[@name='login' and @id='u_0_5_qI']")).click();
		driver.findElement(By.xpath("//button[@name='login' or @id='u_0_5_qI']")).click();
		Thread.sleep(2000);
		System.out.println("edgePass");
		driver.quit();
	}
}
