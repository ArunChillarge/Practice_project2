package test_cases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import page_objects.Main_Home_Page;

public class Main_Home_Page_Test extends Base_class{

	
		

	@Test
		
	public void MainHomePageTest() throws Throwable {
			
			Logger.info("Url is opened");
			Main_Home_Page mhp = new Main_Home_Page(driver);
			
			Thread.sleep(3000);
	 		boolean result1 = mhp.validatecateory();
	 		Assert.assertTrue(result1);
	 		Logger.info("category icon present");
	 		
	 		boolean result2  =	mhp.validatebrands();
	 		Assert.assertTrue(result2);
	 		 Logger.info("brands icon present");
	 		
	 		String actualURL = mhp.geturl();
	 		String ExpectedURL = "https://automationexercise.com/";
	 		
	 		Assert.assertEquals(actualURL, ExpectedURL);
	 			
	 		
		}
	
	
}
