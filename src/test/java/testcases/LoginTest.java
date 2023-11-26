package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{

	// scenario 1
	@Test
	public void LoginSuccessTest() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user","secret_sauce");
		
		WebElement successMessage = driver.findElement(By.xpath("//div[@class='product_label']"));
		System.out.println("The success message is " + successMessage.getText());
		
		String actMsg = successMessage.getText();
		String expMsg = "Products";
		Assert.assertEquals(actMsg,expMsg);
		}
	
	// scenario 2
	@Test
	public void LoginFailiureTest() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user","secret_sauce1");
		
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		System.out.println("The error message is " + errorMessage.getText());
		
		String actMsg = errorMessage.getText();
		String expMsg = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actMsg,expMsg);
			}
	
	
}
