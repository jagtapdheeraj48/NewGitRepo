package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo5 {

	WebDriver driver;
	@Test
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DheerAj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
}
	@Test(priority=1)
	public void loginFunctionality() {
		driver.findElement(By.id("email")).sendKeys("8108428508");
		driver.findElement(By.name("pass")).sendKeys("9322257830");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(true, false);
		driver.navigate().refresh();
}
	@Test(dependsOnMethods= {"loginFunctionality"})
	public void verifyTitle() throws InterruptedException {
		String actualTitle=driver.getTitle();
		driver.navigate().refresh();
		Assert.assertEquals(actualTitle,"(20+) Facebook");
	}	
		
		@Test(priority=3)
		public void tearDown() {
	   driver.quit();
		}
		
}
