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
	String url = "https://www.google.com"; //-------------Set URL that You want to reach-- 
	String searchTerm = "ShowingTime"; //-------------Set the term that You want to search for--
	String resultUrl = "https://www.showingtime.com/"; //-------------Set URL that You want to compare search results to--
	
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
		BrowserFactory.pauseFor(1);
		googlePageObjects.moveToElementAndClick(googlePageObjects.getSearchBtnModal());
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
