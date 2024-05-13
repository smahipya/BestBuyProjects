package BestBuyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.SetCommonfunction;

public class AddItemPage extends SetCommonfunction
{

	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;

	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement searchProduct;
	
	@FindBy(xpath="//span[@class='header-search-icon']")
	WebElement clickSearch;

	@FindBy(xpath="(//div[@class='fulfillment-add-to-cart-button'])[1]")
	WebElement addProduct;
	
	
	public void addToCart(String item1) throws InterruptedException
	{
		click(country);
		
		typeText(searchProduct,item1);
		click(clickSearch);
		click(addProduct);
		
		Thread.sleep(6000);

		
	}
	
}
