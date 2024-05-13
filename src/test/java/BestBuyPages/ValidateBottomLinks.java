package BestBuyPages;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.SetCommonfunction;


public class ValidateBottomLinks extends SetCommonfunction 
{

	
	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	
	@FindBy(xpath="//a[@class='body-copy-sm mr-200']")
	List<WebElement> bottomlink;
	
	public void bottomLinks()
	{
		click(country);
		jsscrollDownBottom();	//scroll to bottom
		for(WebElement link:bottomlink)
		{
			String url=link.getAttribute("href");
			System.out.println(url);
			
		}
	}
}
