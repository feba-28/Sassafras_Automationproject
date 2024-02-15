package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.SassafrasCreateAcc;

public class SassafrasCreateacctest extends Baseclass{
	
	@Test
	public void createACCtesting()
	{
		SassafrasCreateAcc cp=new SassafrasCreateAcc(driver);
		cp.createAccount("Victoria", "Jones", "vjones0100@gmail.com", "vvvvv@j");
				
	}
	
	
	

}
