package testpkg;

import org.apache.poi.hpsf.HPSFException;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.SassafrasHomepage;

public class SassafrasHometest extends Baseclass{

	@Test(priority = 1)
	public void Logo_Titleverification_test()
	{
		SassafrasHomepage hp=new SassafrasHomepage(driver);
		hp.titleverification();
		hp.logo_check();
	}
	

	
	@Test(priority = 2,enabled = true)
	public void mainmenu_test()
	{
		SassafrasHomepage hp=new SassafrasHomepage(driver);
		hp.menuelements_check();
	}
	
	@Test(priority=3)
	public void mhoveringtest() throws InterruptedException
	{
		SassafrasHomepage hp=new SassafrasHomepage(driver);
		hp.mousehovertest();
	}
}
