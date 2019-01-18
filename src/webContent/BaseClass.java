package webContent;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;


public class BaseClass 

{
		protected WebDriver driver;
		protected GooglePageObjects googlePageObjects;
		protected LoginFormUtils loginFormUtils;
         
		@BeforeSuite
		public void initPageObjects()
		{
			googlePageObjects = new GooglePageObjects(driver);
			loginFormUtils = new LoginFormUtils(driver);
		}
		
}
