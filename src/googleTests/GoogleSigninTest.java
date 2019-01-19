package googleTests;


import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webContent.BaseClass;
import webContent.BrowserFactory;

public class GoogleSigninTest extends BaseClass
{
	String url = "https://www.google.com"; //-------------Set URL that You want to reach-- 
	String emailAddress = "angelicasellerst1@gmail.com"; //-------------Set Account email address for logging in-- 
	String emailPass = "q123W456"; //-------------Set Accounts password for logging in-- 
	String desiredAccountData = "Google Account: Angelica Seller"; //-------------Change Name to match expected account owner data-- 
	
//---------------------------------------THIS TEST IS USED FOR SIGNIN FUNCTIONALITY VERIFICATION------------------------------------------	
	
	@BeforeTest
	public void googleReach() 
	{		
		driver = BrowserFactory.startBrowser(url);
		initPageObjects();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("You just reached your page!");
	}    
	
		
	@Test(priority=1)
	public void loginToGoogle() 
	{
		googlePageObjects.getSignIn().click();
		loginFormUtils.getEmailField().sendKeys(emailAddress);
		loginFormUtils.getNextBtnMail().click();
		BrowserFactory.pauseFor(3);
	}
	@Test(priority=2)
	public void signInForm()
	{
		loginFormUtils.getPassField().sendKeys(emailPass);
		loginFormUtils.getNextBtnPass().click();
		BrowserFactory.pauseFor(3);
	}
	@Test(priority=3)
	public void assertAccountLogged()
		{
		String actualString = loginFormUtils.getAccountBtn().getAttribute("title");
		assertTrue(actualString.contains(desiredAccountData));
		}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Test complete.");
		BrowserFactory.closeBrowser(driver);
	}			
}
