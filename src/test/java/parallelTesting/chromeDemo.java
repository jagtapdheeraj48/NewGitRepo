package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeDemo {

	@Test
	public void LoginWithChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DheerAj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("csdvsds");
		driver.findElement(By.xpath("//input[@id='pass' ]")).sendKeys("546516");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();	
		//driver.findElement(By.xpath("//button[@name='login' and @id='u_0_5_qI']")).click();
		driver.findElement(By.xpath("//button[@name='login' or @id='u_0_5_qI']")).click();
		Thread.sleep(2000);
		System.out.println("chromePass");
		driver.quit();
	}
	
}
