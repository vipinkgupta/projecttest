package Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Helpers.LoginPage;

public class JUnitFrameWork {
	public static WebDriver driver;
	@BeforeClass
	public static void openBrowser()
	{
		String baseurl="https://demo.opencart.com/";
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Vipin\\eclipse-workspace\\WiproAssignment-Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void loginPerform() throws InterruptedException, IOException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.clickMyAccount();
		loginpage.clickLoginMenu();
		loginpage.loginAccess();
		loginpage.clickLoginButton();
		loginpage.searchOther();
		Thread.sleep(2000);
		loginpage.showAll();
	}
	@AfterClass
	public static void closeBrowser() throws InterruptedException 
		{
			Thread.sleep(2000);
			//driver.quit();
		}

}
