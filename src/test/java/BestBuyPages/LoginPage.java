package BestBuyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.WrappersBestBuy;

public class LoginPage extends WrappersBestBuy
{
	
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	
	//create an account
	@FindBy(xpath="//button[@id='account-menu-account-button']//*[name()='svg']")
	WebElement accountbut;
	
	//sign in page
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement clickonSignIn;
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement mailid;
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement togglebutton;
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement Password;
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement signIn;

public void loginBestbuy(String mail,String pwd) throws InterruptedException
{
	click(country);
	click(accountbut);
	click(clickonSignIn);
	typeText(mailid,mail);
	click(togglebutton);
	typeText(Password,pwd);
	click(signIn);
	
	Thread.sleep(5000);
}
}