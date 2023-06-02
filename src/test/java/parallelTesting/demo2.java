package parallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo2 {
	WebDriver driver;
    @Parameters("browserType")
	@Test
	public void abc(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DheerAj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver","C:\\Users\\DheerAj\\Downloads\\msedgedriver.exe");
		 driver= new EdgeDriver();
		}
		
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://ui.cogmento.com/");
	}

  @Test(priority=1)
  public void validateFunctionanlity()
  {
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prafulp1010@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
	  driver.findElement(By.xpath("//div[text()='Login']")).click();
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	boolean actualTitle=driver.getTitle().contains("CRM");
	Assert.assertEquals(actualTitle, true);
  } 
  
  @Test(priority=3)
  public void validateUrl()
  {
	boolean actualUrl=driver.getCurrentUrl().contains("cogmento");
	Assert.assertEquals(actualUrl, true);
  }   
  
  @Test(priority=4)
  public void contactLink()
  {
	  driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	  driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
	  driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("ajit");
	  driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("pawar");
	  
	  driver.findElement(By.xpath("//button[contains(@class,'positive')]")).click();
	  driver.findElement(By.xpath("//div[@class='ui fluid multiple selection dropdown']")).click();
	  driver.findElement(By.xpath("//div[@class='selected item']")).click();
	  driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
  }
  
  
  @AfterTest
  public void teardown()
  {
	  driver.quit();
  }
}