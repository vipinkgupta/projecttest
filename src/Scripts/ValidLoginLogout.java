package Scripts;

import org.testng.annotations.Test;

import Base.SuperClass;
import Helpers.LoginPage;

public class ValidLoginLogout extends SuperClass {
	@Test
	public void verifyLoginWithValidCred()
	{
		LoginPage clickLoginButton=new LoginPage(driver);
		clickLoginButton.clickMyAccount();
		clickLoginButton.clickLoginMenu();
		String xl="D:\\Users\\Vipin\\eclipse-workspace\\WiproAssignment-Selenium\\Data\\Credentials.xlsx";
		String sheet="Sheet1";
		int rowCount=Excel.getRowCount(xl, sheet);
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excel.getCellValue(xl, sheet, i, 0);
			System.out.println("User Name is :"+UserName);
			String Password=Excel.getCellValue(xl, sheet, i, 1);
			System.out.println("Password is :"+Password);
			LoginPage login=new LoginPage(driver);
			login.Login(UserName, Password);
			LoginPage clickLoginbutton=new LoginPage(driver);
			clickLoginbutton.clickLoginButton();
			clickLoginbutton.clickMyAccount();
			clickLoginButton.logout();
			clickLoginButton.clickMyAccount();
			clickLoginButton.clickLoginMenu();
			//clickLoginButton.clickLoginButton();
		}
	}

}
