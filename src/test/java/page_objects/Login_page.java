package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_page {

	
		
		public Login_page(WebDriver driver)
		{
			
			PageFactory.initElements(driver,this);
		}

		
		@FindBy(xpath = "//a[@href='/login']")
		WebElement btnlogin1;
		@CacheLookup
	
		
		@FindBy(xpath = "//div[@class='login-form']//input[@name='email']")
		WebElement username;
		@CacheLookup
		
		@FindBy(xpath = "//div[@class='login-form']//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath = "//div[@class='login-form']//button[@type='submit']")
		WebElement btnlogin;
		
		@FindBy(linkText = "/logout")
		WebElement signout;
		
		
		public void clickonloin() {
			btnlogin1.click();
		}
		public void setusername(String uname) {
			username.sendKeys(uname);
		}
		
		public void setpassword(String pwd) {
			password.sendKeys(pwd);
		}
		
		public void clicksubmit() {
			btnlogin.click();
		}
		
		public void Clicksignout() {
			signout.click();
		}
		
}
		
	
