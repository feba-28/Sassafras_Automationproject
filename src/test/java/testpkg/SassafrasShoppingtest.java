package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.SassafrasShoppingpage;
import utilitiespkg.Excelutils;

public class SassafrasShoppingtest extends Baseclass{
	
	@Test(priority = 1)
	public void verify() throws InterruptedException
	{
		SassafrasShoppingpage sp=new SassafrasShoppingpage(driver);
		String xl="C:\\Users\\Feba G Joseph\\Desktop\\correctcred.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.RowCount(xl, Sheet);
		sp.AccountBtn();
		for(int i=1;i<=rowCount;i++)
		{
			String Email=Excelutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("Email--->"+Email);
			String Password=Excelutils.getCellValue(xl, Sheet, i, 1);
			System.out.println("Password--->"+Password);
			
			sp.login(Email, Password);
			
			
			String expURL="https://www.sassafras.in/account";
			String actURL=driver.getCurrentUrl();
			
			if(actURL.equals(expURL))
			{
				System.out.println(actURL);
				sp.startshopping();
			}
		
	}

}
	@Test(priority = 2)
	public void addtocart() throws InterruptedException
	{
		SassafrasShoppingpage ob=new SassafrasShoppingpage(driver);
		ob.selectproduct();
		ob.addtocart();
	}
	
	@Test(priority = 3)
	public void editaddressTest()
	{
		SassafrasShoppingpage ob=new SassafrasShoppingpage(driver);
		ob.editaddress("987654322");
	
	} 
	
	@Test(priority=4)
	public void loggingout()
	{
		SassafrasShoppingpage ob=new SassafrasShoppingpage(driver);
		ob.logouttest();
	}
}
