package BestBuyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.SetCommonfunction;

public class AddshopbyDept extends SetCommonfunction

{
	
	
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	@FindBy(xpath="//header/div[1]/div[1]/nav[1]/button[1]/*[1]")
	WebElement clickMenu;
	@FindBy(xpath="//li[@class='liDropdownList '][5]")
	WebElement clicklistTv;
	@FindBy(xpath="//li[@class='liDropdownList '][3]")
	WebElement TvbyBrand;
	@FindBy(xpath="//a[text()='Samsung TVs']")
	WebElement SamsungTv;
	
	@FindBy(xpath="((//h4[@class='sku-title'])//a)[1]")
	WebElement addproduct;
	@FindBy(xpath="(//div[@class='fulfillment-add-to-cart-button'])[1]")
	WebElement addtocartButton;
	
	public void ShopbyDept() throws InterruptedException
	{
		click(country);
		click(clickMenu);
		click(clicklistTv);
		click(TvbyBrand);
		click(SamsungTv);
      
		click(addproduct);
		click(addtocartButton);
		
		Thread.sleep(3000);
		

	}

}
