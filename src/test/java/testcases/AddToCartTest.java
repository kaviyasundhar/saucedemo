package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProjectPage;

public class AddToCartTest extends BaseClass {

	
	@Test
	public void AddOneProductTest() {
		
		String ProductName = "Sauce Labs Backpack";
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user","secret_sauce");
		
		ProjectPage product = new ProjectPage(driver);
		product.addtocart(ProductName);
	}
	
	
}
