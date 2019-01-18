package webContent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginFormUtils 
{
//---------------------Here are the page objects formed as setters/getters so we can use them for login functionality----	
	
		WebDriver driver;
		
		public LoginFormUtils(WebDriver localDriver) 
			{
				this.driver = localDriver;
				PageFactory.initElements(driver, this);
			}
		
		private WebElement resultField;
		private WebElement emailField;
		private WebElement nextBtnMail;
		private WebElement passField;
		private WebElement nextBtnPass;
		private WebElement accountBtn;
		
//-------------------------------------------Util page objects-------------------------------------------
		public WebElement getResultField()
		{
			resultField = driver.findElement(By.xpath("//H3[@class='LC20lb']"));
			return resultField;
		}
	public WebElement getEmailField()
		{
			emailField = driver.findElement(By.id("identifierId"));
			return emailField;
		}
	public WebElement getPassField()
		{
			passField = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
			return passField;
		}
	public WebElement getNextBtnMail()
		{
			nextBtnMail = driver.findElement(By.id("identifierNext"));
			return nextBtnMail;
		}
	public WebElement getNextBtnPass()
		{
			nextBtnPass = driver.findElement(By.id("passwordNext"));
			return nextBtnPass;
		}
	public WebElement getAccountBtn()
		{
			accountBtn = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[1]/a"));
			return accountBtn;
		}
}

