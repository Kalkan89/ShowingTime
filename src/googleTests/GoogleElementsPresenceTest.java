package googleTests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webContent.BaseClass;
import webContent.BrowserFactory;

public class GoogleElementsPresenceTest extends BaseClass
{
	String url = "https://www.google.com"; //-------------Set URL that You want to reach--
	
//---------------------------------------THIS TEST VERIFIES THAT ALL PAGE ELEMENTS ARE PRESENT---------------------------------------------	
	
	@BeforeTest
	public void googleReach() 
	{		
		driver = BrowserFactory.startBrowser(url);
		initPageObjects();
		System.out.println("You just reached your page!");	
	}    
	
	
	
	@Test
	public void pageElementsVerification()
	{
		assert googlePageObjects.getGmail().isDisplayed();
		assert googlePageObjects.getPictures().isDisplayed();
		assert googlePageObjects.getGoggleApps().isDisplayed();
		assert googlePageObjects.getSignIn().isDisplayed();
		assert googlePageObjects.getLogo().isDisplayed();
		assert googlePageObjects.getSearchField().isDisplayed();
		assert googlePageObjects.getSearchBtn().isDisplayed();
		assert googlePageObjects.getWhatsNew().isDisplayed();
		assert googlePageObjects.getLanguagesSel().isDisplayed();
		assert googlePageObjects.getCurrentLocation().isDisplayed();
		assert googlePageObjects.getAdPolicy().isDisplayed();
		assert googlePageObjects.getWork().isDisplayed();
		assert googlePageObjects.getBasicInfo().isDisplayed();
		assert googlePageObjects.getPrivacyPolicy().isDisplayed();
		assert googlePageObjects.getTerms().isDisplayed();
		assert googlePageObjects.getSetup().isDisplayed();
	}
	@AfterClass
	public void closeBrowser()
	{
		BrowserFactory.closeBrowser(driver);
	}	
}
