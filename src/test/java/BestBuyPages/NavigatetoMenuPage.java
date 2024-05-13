package BestBuyPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BestBuyUtils.SetCommonfunction;


public class NavigatetoMenuPage extends SetCommonfunction

{

	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;

	@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement clickonMenu;

	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topdeal;

	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement dealOfDay;


	public void navigatetoMenu()
	{

		click(country);
		click(clickonMenu);
		click(topdeal);
		String expectedTitle="Top Deals";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}

		driver.navigate().back();

		click(dealOfDay);
		expectedTitle="Deal";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}


	}
	
}
