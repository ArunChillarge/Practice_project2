package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Home_Page {

	public static	WebDriver driver;
	
	@FindBy(xpath = "//h2[text()='Category']")
	WebElement category;
	
	@FindBy(xpath = "//h2[text()='Brands']")
	WebElement brands;
	
	
	

	public Main_Home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public boolean validatecateory () {
		return category.isDisplayed();
	}
	public boolean validatebrands () {
		return brands.isDisplayed();
	}
	public String geturl() throws Throwable {
		String URL  =  driver.getCurrentUrl();
		return URL;
	
	}	
}
