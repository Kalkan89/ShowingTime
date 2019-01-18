package webContent;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserFactory
{
	
		static String ChromeDriverLocation = "C:\\Users\\desktop\\Desktop\\chromedriver.exe";
		
//Initial setup of the chromedriver, it will be instanced in other Test classes as well as methods.
		 
		public static WebDriver startBrowser(String url)
		{
			System.setProperty("webdriver.chrome.driver", ChromeDriverLocation);
			WebDriver driver = new ChromeDriver();
			getUrl(url, driver);
			return driver;	
		}
		
		private static void getUrl(String url, WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().window().fullscreen(); //--Comment-out if Windows is used
			driver.manage().window().maximize();	//--Comment-out if MacOS is used
			driver.get(url);
			Assert.assertTrue(driver.getCurrentUrl().contains(url));
			System.out.println("Browser opened with the url: "+url);
			driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[2]")).click();//--Comment-out if MacOs is used or English is set to default.
		}
		public static void pauseFor(double d)
		{
			try
			{
				double miliseconds = d*1000;
				Thread.sleep((long) miliseconds);				
			}
			catch(InterruptedException e)
			{
				System.out.println(e.toString());
			}
		}
		public static void closeBrowser(WebDriver driver)
		{
			driver.quit();
			System.out.println("Browser closed!");
		}
}

