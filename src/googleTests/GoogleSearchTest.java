package googleTests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webContent.BaseClass;
import webContent.BrowserFactory;

public class GoogleSearchTest extends BaseClass
{
	String url = "https://www.google.com";
	String searchTerm = "ShowingTime";
	String resultUrl = "https://www.showingtime.com/";
	
//---------------------------------------THIS TEST IS USED FOR SEARCH FUNCTIONALITY VERIFICATION------------------------------------------	
		
	@BeforeTest
	public void googleReach() 
	{		
		driver = BrowserFactory.startBrowser(url);
		initPageObjects();
		System.out.println("You just reached your page!");	
	}    
	
	
	
	@Test
	public void searchFunctionality()
	{
		googlePageObjects.getSearchField().sendKeys(searchTerm);
		googlePageObjects.moveToElementAndClick(googlePageObjects.getSearchBtn());
		loginFormUtils.getResultField().click();
		BrowserFactory.pauseFor(2);
		String desiredUrl = driver.getCurrentUrl();
		assert desiredUrl.equals(resultUrl);		
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Test complete.");
		BrowserFactory.closeBrowser(driver);
	}
}
