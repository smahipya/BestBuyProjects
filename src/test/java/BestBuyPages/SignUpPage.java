package BestBuyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.WrappersBestBuy;

public class SignUpPage extends WrappersBestBuy
{
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	
	//create an account
	@FindBy(xpath="//button[@id='account-menu-account-button']//*[name()='svg']")
	WebElement accountbutton;
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createacc;
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement toggle;
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement pwd;
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement pwdreenter;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phnum;
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement clickcreateacc;
	
	//sign in page
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signInclick;
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement signInmailid;
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement togglebutton;
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement signInPwd;
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement signIn;
	
	
	public void Signup(String fname,String lname,String emailid,String cpwd,String rcpwd,String pNum) throws InterruptedException 
	{
		waitForMe(country,5);
		click(country);
		
		waitForMe(accountbutton,20);
		click(accountbutton);
		
		click(createacc);
		typeText(firstname,fname);
		typeText(lastname,lname);
		typeText(email,emailid);
		click(toggle);
		typeText(pwd,cpwd);
		typeText(pwdreenter,rcpwd);
		typeText(phnum,pNum);
		click(clickcreateacc);
		
		Thread.sleep(2000);
		navigateBack();
		
		
	}	
}
