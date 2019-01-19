package googleTests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webContent.BaseClass;
import webContent.BrowserFactory;

public class GoogleElementsLabelsTest extends BaseClass
{
	String url = "https://www.google.com";   //-------------Set URL that You want to reach--
	String currentLocationEntry = "Serbia";  //-------------Set desired location for country title verification--
		
//----------------------------------------THIS TEST VERIFIES THAT ALL PAGE ELEMENTS ARE PROPERLY TITLED-----------------------------------------	
		
	@BeforeTest
	public void googleReach() 
	{		
		driver = BrowserFactory.startBrowser(url);
		initPageObjects();
		System.out.println("You just reached your page!");
	}    
	
	
	
	@Test
	public void pageElementsLabels()
	{
		assert googlePageObjects.getGmail().getText().equals("Gmail");
		assert googlePageObjects.getPictures().getText().equals("Images");
		assert googlePageObjects.getGoggleApps().getAttribute("title").matches("Google apps");
		assert googlePageObjects.getSignIn().getText().equals("Sign in");
		assert googlePageObjects.getSearchField().getAttribute("title").matches("Search");
		assert googlePageObjects.getSearchBtn().getAttribute("name").matches("btnK");
		assert googlePageObjects.getWhatsNew().getAttribute("name").matches("btnI");
		assert googlePageObjects.getCurrentLocation().getText().equals(currentLocationEntry);
		if (googlePageObjects.getCurrentLocation().getText().equals(currentLocationEntry)) 
		assert googlePageObjects.getLanguagesSel().getText().equals("Google offered in: српски srpski");
		assert googlePageObjects.getAdPolicy().getText().equals("Advertising");
		assert googlePageObjects.getWork().getText().equals("Business");
		assert googlePageObjects.getBasicInfo().getText().equals("About");
		assert googlePageObjects.getPrivacyPolicy().getText().equals("Privacy");
		assert googlePageObjects.getTerms().getText().equals("Terms");
		assert googlePageObjects.getSetup().getText().equals("Settings");	
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Logo title is dinamycally generated.");
		System.out.println("Test complete.");
		BrowserFactory.closeBrowser(driver);
	}
}
