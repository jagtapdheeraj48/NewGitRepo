package pageLayer;

import org.openqa.selenium.By;

import BaseLayer.baseClass;

public class loginPage extends baseClass{

	
	   By username=By.id("email");
	   By password =By.name("pass");
	   By login=By.name("login");
	   
	  public  loginPage(){
		   this.driver=driver;
	   }
	  
	  public void loginFunctionality(String uname,String pass) {
		  
		  driver.findElement(username).sendKeys(uname);
		  driver.findElement(password).sendKeys(pass);
		  driver.findElement(login).click();
	  }
	  
}
