package BestBuyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.SetCommonfunction;

public class CheckoutPage extends SetCommonfunction

{
	
	
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement goToCart;
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement continuetoPayment;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement fname;
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lname;
	@FindBy(xpath="//input[@id='address-input']")
	WebElement address;
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	@FindBy(xpath="//select[@class='tb-select']")
	WebElement state;
	@FindBy(xpath="//input[@id='postalCode']")
	WebElement zipcode;
	
	
	public void CheckoutPayment(String FName,String LName,String add,String City,String State,String Zip)
	{
		click(country);
		click(goToCart);
		click(checkout);
	
		jsscrollDownBottom();
		click(continuetoPayment);
		
		typeText(fname,FName);
		typeText(lname,LName);
		typeText(address,add);
		typeText(city,City);
		selectByIndex(state,40);
		typeText(zipcode,Zip);
		
	}

}
