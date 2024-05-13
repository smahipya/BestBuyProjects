package BestBuyTests;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BestBuyUtils.Reports;
import BestBuyUtils.SetCommonfunction;
import BestBuyUtils.WrappersBestBuy;

public class BestBuyTests extends SetCommonfunction

{
	
	

	WrappersBestBuy best=new WrappersBestBuy();
	SetCommonfunction set= new SetCommonfunction();
		
	@DataProvider(name="Login valid")
	public Object[][] readDataExcel() throws IOException
	{
		Object[][] data=null;
		XSSFWorkbook workbook=null;
		try
		{
			workbook= new XSSFWorkbook(System.getProperty("user.dir")+"/bestbuy.xlsx");	//C:\Users\Administrator\Documents\bestbuy.xlsx
			XSSFSheet sheet= workbook.getSheetAt(0);
			XSSFRow row= sheet.getRow(0);
			//it will return the no. of rows in that specific sheet
			int noOfRows=sheet.getPhysicalNumberOfRows();
			
			//it will return the no.of cells in that specific row (row no->1)
			int noOfCells= row.getPhysicalNumberOfCells();
			
			data= new Object[noOfRows-1][noOfCells]; //data[5][2]
			
			for(int i=1; i<noOfRows;i++)
			{
				for(int j=0; j<noOfCells;j++)
				{
					String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println("Cell Value -->"+cellValue);
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			workbook.close();
		}
		
		return data;
	}

	@Test(priority=1)		//launch browser test case
	public void TestcaseLaunchBrowser()
	{
		Reports.startReport();
		Reports.setTCDesc("Valid BestBuyLaunchBrowser functionality");
		launchBrowser("https://www.bestbuy.com/");	
		
	}
	
	
	public void createaccTestcase() throws InterruptedException
	{
		//create acc test case
		Reports.setTCDesc("Valid BestBuycreateAcc functionality");

		launchBrowser("https://www.bestbuy.com/");	
		best.SignUp("mahi", "mahe", "mahi015@gmail.com", "my name is mahi", "my name is mahi", "9677672869");
		screenshot("Accoun_create");
	}
	
	@Test(priority=3,dataProvider="Login valid")		//login to best buy test case
	public void validLoginTestcase() throws InterruptedException
	{
		//login to best buy test case
		Reports.setTCDesc("Valid BestBuyLoginFunctionality functionality");

		launchBrowser("https://www.bestbuy.com/");	
		best.loginBestbuy();
		screenshot("signup_valid");

		
	}
	
	@Test(priority=4)		//negative test case for login
	public void InvalidLoginTestCase() throws InterruptedException
	{
		//login negative test case
		Reports.setTCDesc("Valid BestBuyinvalidLogin functionality");

		best.invalidloginBestbuy("mahi015@gmail.com", "my name is mahi");
		
	}
	
	@Test(priority=5)		//navigate to manu page test case
	public void menuNavigate()
	{
		//navigate to menu test case
		Reports.setTCDesc("Valid BestBuy NavigatetoMenu functionality");

		launchBrowser("https://www.bestbuy.com/");	
		best.NavigatetoMenupage();
		screenshot("menu_page");
	}
		
	@Test(priority=6)		//get bottom links test case
	public void bottomLink()
	{
		launchBrowser("https://www.bestbuy.com/");
		best.bottomLink();	
	}
	
	@Test(priority=7)		//add items to the cart using search box
	public void AddItems() throws InterruptedException
	{
		Reports.setTCDesc("Valid BestBuy AddItems functionality");

		launchBrowser("https://www.bestbuy.com/");	//launch browser test case

		best.AddItemsToCart("Dell core i5 7th generation");
		screenshot("AddItems");
	}
	
	@Test(priority=8)		//add shop by department item to the cart
	public void addShopbyDept() throws InterruptedException
	{
		Reports.setTCDesc("Valid BestBuy shopbyDepartment functionality");

		launchBrowser("https://www.bestbuy.com/");	
		best.shopBydepartment();
		
	}
	
	@Test(priority=9)		//select item from brand and add to cart
	public void SelectByBrand()
	{
		Reports.setTCDesc("Valid BestBuy SelectbyBrand functionality");

		launchBrowser("https://www.bestbuy.com/");	
		best.selectbyBrand();
	}
	
	@Test(priority=10)		//selected item proceed for payment
	public void CheckoutToPayment() throws InterruptedException
	{
		Reports.setTCDesc("Valid BestBuy select brand functionality");

		launchBrowser("https://www.bestbuy.com/");	
		best.loginBestbuy();
		best.Paymentcheckout();
	}
	
}
