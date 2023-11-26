package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	
	//=================================== Locators =============================
	
	@FindBy(id="user-name")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login-button")
	WebElement LoginBtn;
	
	
	
	// ================================== Functions ============================
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	public void LoginFunction(String UserNameVal,String PwdVal) {
		UserName.sendKeys(UserNameVal);
		Password.sendKeys(PwdVal);
		LoginBtn.click();
	}
}
