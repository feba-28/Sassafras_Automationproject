package testpkg;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.SassafrasLoginpage;
import utilitiespkg.Excelutils;

public class SassafrasLogintest extends Baseclass{
	
	@Test
	public void loginvalidationtest() throws InterruptedException
	{
		SassafrasLoginpage lp=new SassafrasLoginpage(driver);
		String xl="C:\\Users\\Feba G Joseph\\Desktop\\SScredentials.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.RowCount(xl, Sheet);
		lp.AccountBtn();
		for(int i=1;i<=rowCount;i++)
		{
			String Email=Excelutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("Email--->"+Email);
			String Password=Excelutils.getCellValue(xl, Sheet, i, 1);
			System.out.println("Password--->"+Password);
			
			lp.setlogincred(Email, Password);
			//ob.clickLogin();
			
			String expURL="https://www.sassafras.in/account";
			String actURL=driver.getCurrentUrl();
			
			if(actURL.equals(expURL))
			{
				System.out.println(actURL);
				
			
			}
			
			
			
	
		}
				
	}

}
