package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.SuperClass;
import Helpers.LoginPage;

public class EndToEndProccess extends SuperClass {
	@Test
	public void endToEndProccess() throws IOException, InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.clickMyAccount();
		loginpage.clickLoginMenu();
		loginpage.loginAccess();
		loginpage.clickLoginButton();
		loginpage.searchAction();
		loginpage.components();
		loginpage.phoneAndPda();
		loginpage.phonesCompare();
		loginpage.LaptopsAndNotebooks();
		driver.navigate().back();
		loginpage.orderHistory();
		loginpage.subscribeNewsletters();
		loginpage.spacialsExtra();
	}

}
