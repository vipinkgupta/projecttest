package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class SuperClass {
	public WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		String baseurl="https://demo.opencart.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\project\\projecttest\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException 
		{
			Thread.sleep(5000);
			driver.quit();
		}

}
