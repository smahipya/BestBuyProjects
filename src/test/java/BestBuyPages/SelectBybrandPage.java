package BestBuyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.SetCommonfunction;

public class SelectBybrandPage extends SetCommonfunction

{

	
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	@FindBy(xpath="//button[@data-t='hamburger-navigation-button']")
	WebElement menuClick;
	@FindBy(xpath="//button[@data-id='node-86']")
	WebElement clickbrand;
	@FindBy(xpath="//a[text()='Dell']")
	WebElement selectDell;
	@FindBy(xpath="(//div[@class='flex-copy-wrapper'])[1]")
	WebElement Laptops;

	@FindBy(xpath="//input[@id='soldout_facet-Exclude-Out-of-Stock-Items-0']")
	WebElement outofStock;
	@FindBy(xpath="(//h4[@class='sku-title']//a)[1]")
	WebElement Selectlaptop;
	@FindBy(xpath="(//div[@class='fulfillment-add-to-cart-button'])[1]")
	WebElement addtocartbutton;

	public void selectbyBrand()
	{
		click(country);
		click(menuClick);
		click(clickbrand);
		click(selectDell);
		click(Laptops);
		
		click(outofStock);
		click(Selectlaptop);
		
		if (addtocartbutton.isDisplayed())
		{
			addtocartbutton.click();
		

		}
		else {
			System.out.println("Product is out of stock.");
		
		}

	
	}
}
