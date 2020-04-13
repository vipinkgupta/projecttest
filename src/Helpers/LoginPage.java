package Helpers;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

import Base.SuperClass;

public class LoginPage extends SuperClass {
	@FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement myAccount;
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginBtn;
	@FindBy(id="input-email")
	private WebElement emailText;
	@FindBy(id="input-password")
	private WebElement passwordText;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginbutton;
	@FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
	private WebElement logoutButton;
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchText;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButtonClick;
	@FindBy(xpath="//a[contains(text(),'Components')]")
	private WebElement components;
	@FindBy(xpath="//a[contains(text(),'Monitors (2)')]")
	private WebElement monitors;
	@FindBy(xpath="//a[contains(text(),'Phones & PDAs')]")
	private WebElement phonesandpda;
	@FindBy(xpath="//select[@id='input-sort']")
	private WebElement phonesortby;
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]//i[1]")
	private WebElement firstproduct;
	@FindBy(xpath="//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[3]//i[1]")
	private WebElement secondproduct;
	@FindBy(xpath="//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement thirdproduct;
	@FindBy(xpath="//a[contains(@href, 'https://demo.opencart.com/index.php?route=product/compare')]")
	private WebElement productcomparison;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/strong[1]")
	private WebElement firstphone;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div[1]/ul/li[5]")
	private WebElement fifthfeature;
	@FindBy(id="button-cart")
	private WebElement addtocartbtn;
	@FindBy(xpath="//a[contains(text(),'shopping cart')]")
	private WebElement shoppingcartbtn;
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement checkoutbtn;
	@FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'Laptops & Notebooks')]")
	private WebElement laptopsandnotebooks;
	@FindBy(xpath="//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showalllapandnote;
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]")
	private WebElement hpaddtocart;
	@FindBy(id="button-cart")
	private WebElement addcart;
	@FindBy(xpath="/html/body/div[2]/div[1]/a[2]")
	private WebElement hpshoppingcart;
	@FindBy(xpath="//input[@id='button-payment-address']")
	private WebElement continuesecond;
	@FindBy(xpath="//input[@id='button-shipping-address']")
	private WebElement continuethird;
	@FindBy(id="button-shipping-method")
	private WebElement continuefourth;
	@FindBy(xpath="//input[@name='agree']")
	private WebElement termandconditions;
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement continuefifth;
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement confirmbutton;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Order History')]")
	private WebElement orderhistory;
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Newsletter')]")
	private WebElement newsletters;
	@FindBy(xpath="//a[contains(text(),'Specials')]")
	private WebElement spacialsextra;
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement enterquantity;
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/table/tbody/tr/td[6]")
	private WebElement totalValue;
	@FindBy(xpath="//a[@class='btn btn-default']")
	private WebElement continueshopping;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement removeelement;
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement clicktocontinue;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickMyAccount()
	{
		myAccount.click();
		System.out.println("Clicked on My Account");
	}
	public void clickLoginMenu()
	{
		loginBtn.click();
		System.out.println("Clicked on Login button");
	}
	public void Login(String UserName, String Password)
	{
		emailText.sendKeys(UserName);
		System.out.println("User Name entered");
		passwordText.sendKeys(Password);
		System.out.println("Password entered");
	}
	public void loginAccess()
	{
		emailText.sendKeys("vipin@gmail.com");
		passwordText.sendKeys("Test@123");
	}
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	public void searchAction()
	{
		searchText.sendKeys("Phone");
		searchButtonClick.click();
	}
	public void searchOther()
	{
		searchText.sendKeys("HP");
		searchButtonClick.click();
	}
	public void components()
	{
		components.click();
		monitors.click();
	}
	public void phoneAndPda()
	{
		phonesandpda.click();
		Select sortdrp=new Select(phonesortby);
		sortdrp.selectByVisibleText("Price (High > Low)");
	}
	public void phonesCompare() throws IOException, InterruptedException
	{
		firstproduct.click();
		secondproduct.click();
		thirdproduct.click();
		productcomparison.click();
		System.out.println("product comparison done.");
		firstphone.click();
		Thread.sleep(3000);
		String str=fifthfeature.getText();
		Thread.sleep(3000);
		File datafile=new File("D:\\Users\\Vipin\\eclipse-workspace\\WiproAssignment-Selenium\\Data\\Write.txt");
		FileUtils.writeStringToFile(datafile, str);
		addtocartbtn.click();
		shoppingcartbtn.click();
		checkoutbtn.click();
		removeelement.click();
		clicktocontinue.click();
	}
	public void LaptopsAndNotebooks() throws InterruptedException
	{
		laptopsandnotebooks.click();
		Thread.sleep(3000);
		showalllapandnote.click();
		Thread.sleep(3000);
		hpaddtocart.click();
		Thread.sleep(3000);
		addcart.click();
		Thread.sleep(3000);
		hpshoppingcart.click();
		Thread.sleep(3000);
		checkoutbtn.click();
		Thread.sleep(3000);
		continuesecond.click();
		Thread.sleep(3000);
		continuethird.click();
		Thread.sleep(3000);
		continuefourth.click();
		Thread.sleep(3000);
		termandconditions.click();
		Thread.sleep(3000);
		continuefifth.click();
		Thread.sleep(3000);
		confirmbutton.click();
		Thread.sleep(3000);
	}
	public void showAll() throws InterruptedException, IOException
	{
		hpaddtocart.click();
		Thread.sleep(5000);
		enterquantity.clear();
		Thread.sleep(5000);
		enterquantity.sendKeys("2");
		Thread.sleep(5000);
		addcart.click();
		Thread.sleep(5000);
		hpshoppingcart.click();
		String str=totalValue.getText();
		System.out.println(str);
		File datafile=new File("D:\\Users\\Vipin\\eclipse-workspace\\WiproAssignment-Selenium\\Data\\Value.txt");
		FileUtils.writeStringToFile(datafile, str);
		System.out.println("Total value is printed on flat file");
		Thread.sleep(3000);
		System.out.println("All is OK");
		String string="$300.00";
		String numWihoutDecimal1 = String.valueOf(string).split("\\.")[0];
		System.out.println(numWihoutDecimal1);
		String remove=numWihoutDecimal1.substring(1);
		System.out.println(remove);
		int iTest=Integer.parseInt(remove);
		System.out.println(iTest);
		String numWihoutDecimal2 = String.valueOf(str).split("\\.")[0];
		System.out.println(numWihoutDecimal2);
		String remove1=numWihoutDecimal2.substring(1);
		System.out.println(remove1);
		int iTest1=Integer.parseInt(remove1);
		System.out.println(iTest1);
		if(iTest1>=iTest)
			{
				System.out.println("Total value is large");
				this.logout();
			}
		else
			{
				System.out.println("Compare value is large");
				continueshopping.click();
			}
	}
	public void orderHistory()
	{
		myAccount.click();
		orderhistory.click();
	}
	public void subscribeNewsletters()
	{
		newsletters.click();
	}
	public void spacialsExtra()
	{
		spacialsextra.click();
	}
	public void logout()
	{
		myAccount.click();
		logoutButton.click();
		System.out.println("Logout successfully");
	}

}
