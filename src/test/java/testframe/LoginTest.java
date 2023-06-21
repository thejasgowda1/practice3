package testframe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.Base;

public class LoginTest extends Base{
	
	public LoginTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		intializeDriver();
	}

	@Test

	public void login() {
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
