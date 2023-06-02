package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class demo2 {

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
		driver.navigate().refresh(); 
	}
	@Test(priority=2)
	public void verifyTitle() throws InterruptedException {
		String actualTitle=driver.getTitle();
		driver.navigate().refresh();
		Assert.assertEquals(actualTitle,"Facebook");
	}
	@Test(priority=3)
	public void LogoutFunctinality() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-nocookies='true']")).click();
		
	}
	@Test(priority=4)
	public void tearDown() {
   driver.quit();
	}
		
}
