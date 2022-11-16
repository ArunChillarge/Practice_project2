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

		@FindBy(xpath = "//input[@type='text']")
		WebElement username;
		@CacheLookup
		
		@FindBy(xpath = "//input[@type='password']")
		WebElement password;
		
		@FindBy(xpath = "//*[@name=\"login\"]")
		WebElement btnlogin;
		
		/*@FindBy(xpath = "/html/body/div[3]/div/ul/li[3]/a")
		WebElement signout;
		*/
		
		
		public void setusername(String uname) {
			username.sendKeys(uname);
		}
		
		public void setpassword(String pwd) {
			password.sendKeys(pwd);
		}
		
		public void clicksubmit() {
			btnlogin.click();
		}
		
		/*public void Clicksignout() {
			signout.click();
		}
		*/
		
}
		
	
