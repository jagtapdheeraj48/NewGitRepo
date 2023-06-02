package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	public static WebDriver driver;
	
	public static void initialzation() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DheerAj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public static void begin() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DheerAj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.swiggy.com/"); 
		driver.manage().window().maximize();
	}
}
