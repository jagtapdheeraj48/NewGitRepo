package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fbdemo {

	@Test(dataProvider="login")
	public void register(String fname, String lastName)
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DheerAj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		}
	@DataProvider(name="login")
	public Object[][] testdata(){
		
		ExcelReader opl= new ExcelReader("D:\\\\file CLass\\\\New folder\\\\vvvvvvv\\\\file2.xlsx");
		
		int row= opl.getRowsCount(3);
		int cell= opl.getCellCount(3);
		System.out.println(row);
		System.out.println(cell);

		Object [][] abc= new Object[row][cell];
		
		for(int i=0; i<=row; i++)
		{
			abc[i][0]=opl.getData(3, i, 0);
			abc[i][1]=opl.getData(3, i, 1);
			
		}
		System.out.println("pink");
		return abc;
	}
}
