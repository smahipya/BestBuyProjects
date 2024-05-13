package BestBuyUtils;

import org.openqa.selenium.support.PageFactory;

import BestBuyPages.AddshopbyDept;
import BestBuyPages.AddItemPage;
import BestBuyPages.CheckoutPage;
import BestBuyPages.LoginPage;
import BestBuyPages.NavigatetoMenuPage;
import BestBuyPages.SelectBybrandPage;
import BestBuyPages.SignUpPage;
import BestBuyPages.ValidateBottomLinks;

public class WrappersBestBuy extends SetCommonfunction 
{

	//WrappersBestBuy best= new WrappersBestBuy();

	public void SignUp(String fname,String lname,String email,String pwd,String repwd,String phnum) throws InterruptedException
	{
		
		SignUpPage signPage=PageFactory.initElements(driver, SignUpPage.class);
		signPage.Signup(fname, lname, email, pwd, repwd, phnum);
			
	}
	
		
		public void loginBestbuy() throws InterruptedException
		{
			LoginPage logPge=PageFactory.initElements(driver, LoginPage.class);
			logPge.loginBestbuy("mahi015@gmail.com", "my name is mahi");
		}
		
		

		public void invalidloginBestbuy(String mailSi,String pwdsi) throws InterruptedException
		{
			LoginPage logPge=PageFactory.initElements(driver, LoginPage.class);
			logPge.loginBestbuy(mailSi, pwdsi);
		}
		
		public void NavigatetoMenupage()
		{
			NavigatetoMenuPage nmpage=PageFactory.initElements(driver, NavigatetoMenuPage.class);
			nmpage.navigatetoMenu();
		}
		
		public void bottomLink()
		{
			ValidateBottomLinks link=PageFactory.initElements(driver, ValidateBottomLinks.class);
			link.bottomLinks();
		}
		
		public void AddItemsToCart(String item1) throws InterruptedException
		{
			
			AddItemPage addPage=PageFactory.initElements(driver, AddItemPage.class);
			
			addPage.addToCart(item1);
		}

		public void shopBydepartment() throws InterruptedException
		{
			AddshopbyDept dept=PageFactory.initElements(driver, AddshopbyDept.class);
			dept.ShopbyDept();
		}
		
		public void selectbyBrand()
		{
			SelectBybrandPage brand=PageFactory.initElements(driver, SelectBybrandPage.class);
			brand.selectbyBrand();
		}
	

		public void Paymentcheckout()
		{
			CheckoutPage check=PageFactory.initElements(driver, CheckoutPage.class);
			check.CheckoutPayment("mahi", "mahe", "ppm", "erode", "TN", "60869");
		}
		
}
