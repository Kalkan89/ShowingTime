package webContent;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GooglePageObjects 
{
//---------------------Here are the page objects formed as setters/getters so we can use them in other classes--	
	
	WebDriver driver;
	
	public GooglePageObjects(WebDriver localDriver) 
		{
			this.driver = localDriver;
			PageFactory.initElements(driver, this);
		}
	
	private WebElement gmail;
	private WebElement pictures;
	private WebElement googleApps;
	private WebElement signIn;
	private WebElement logo;
	private WebElement searchField;
	private WebElement searchBtn;
	private WebElement whatsNew;
	private WebElement languagesSel;
	private WebElement currentLocation;
	private WebElement adPolicy;
	private WebElement work;
	private WebElement basicInfo;
	private WebElement privacyPolicy;
	private WebElement terms;
	private WebElement setup;

	
//------------------------------GOOGLE OBJECTS-----------------------------------------------	

	public WebElement getGmail() 
		{
			gmail = driver.findElement(By.xpath("//A[@class='gb_P'][text()='Gmail']"));
			return gmail;		
		}
	public WebElement getPictures()
		{
			pictures = driver.findElement(By.xpath("//A[@class='gb_P'][text()='Images']"));
			return pictures;
		}
	public WebElement getGoggleApps()
		{
			googleApps = driver.findElement(By.xpath("//A[@class='gb_b gb_xc']"));
			return googleApps;
		}
	public WebElement getSignIn()
		{
			signIn = driver.findElement(By.id("gb_70"));
			return signIn;
		}
	public WebElement getLogo()
		{
			logo = driver.findElement(By.id("hplogo"));
			return logo;
		}
	public WebElement getSearchField()
		{
			searchField = driver.findElement(By.xpath("//INPUT[@class='gLFyf gsfi']"));
			return searchField;
		}
	public WebElement getSearchBtn()
		{
			searchBtn = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
			return searchBtn;
		}
	public WebElement getWhatsNew()
		{
			whatsNew = driver.findElement(By.xpath("(//INPUT[@name='btnI'])[2]"));
			return whatsNew;
		}
	public WebElement getLanguagesSel()
		{
			languagesSel = driver.findElement(By.id("SIvCob"));
			return languagesSel;
		}
	public WebElement getCurrentLocation()
		{
			currentLocation = driver.findElement(By.xpath("//SPAN[@class='Q8LRLc'][text()='Serbia']"));
			return currentLocation;
		}
	public WebElement getAdPolicy()
		{
			adPolicy = driver.findElement(By.xpath("//A[@class='Fx4vi'][text()='Advertising']"));
			return adPolicy;
		}
	public WebElement getWork()
		{
			work = driver.findElement(By.xpath("//A[@class='Fx4vi'][text()='Business']"));
			return work;
		}
	public WebElement getBasicInfo()
		{
			basicInfo = driver.findElement(By.xpath("//A[@class='Fx4vi'][text()='About']"));
			return basicInfo;
		}
	public WebElement getPrivacyPolicy()
		{
			privacyPolicy = driver.findElement(By.xpath("//A[@class='Fx4vi'][text()='Privacy']"));
			return privacyPolicy;
		}
	public WebElement getTerms()
		{
			terms = driver.findElement(By.xpath("//A[@class='Fx4vi'][text()='Terms']"));
			return terms;
		}
	public WebElement getSetup()
		{
			setup = driver.findElement(By.id("fsettl"));
			return setup;
		}
	//----------------------page scroll------------------------------
	public void moveToElementAndClick(WebElement element)
	{
		int YLoc = element.getLocation().getY()-100;
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, "+YLoc+");");
		element.click();
	}
	
}