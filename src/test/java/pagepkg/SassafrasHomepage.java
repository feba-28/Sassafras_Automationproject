package pagepkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SassafrasHomepage {
	
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div/div/h1/a/img")
	WebElement logo;
	@FindBy(tagName = "a")
	List<WebElement> linkdetails;
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div/div/nav/desktop-navigation/ul/li")
	List<WebElement> menuelements;
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div/div/nav/desktop-navigation/ul/li[6]/a")
	WebElement teens_kids;
	@FindBy(xpath = "//*[@id=\"desktop-menu-6\"]/li[3]/a")
	WebElement tops;
	@FindBy(xpath = "//*[@id=\"facet-filters-form\"]/div/div[4]/button")
	WebElement colorfilter;
	@FindBy(xpath = "//*[@id=\"facet-filter-filter.v.option.color\"]/div/div/div[10]/label")
	WebElement white;
	WebDriver driver;
	
	public SassafrasHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void titleverification()
	{
		String actualTitle=driver.getTitle();
		System.out.println("Title="+actualTitle);
		String expectedTitle="Sassafras - Online Shopping for Latest Women's Fashion at Best Prices";
				Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void logo_check()
	{
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
	}
	
	public void menuelements_check()
	{
		int count=menuelements.size();
		System.out.println("Number of menu elements = "+count);
		System.out.println("Elements:");
		for(WebElement element:menuelements)
		System.out.println(element.getText());

	}
	 public void mousehovertest() throws InterruptedException
	 {
		 Actions a=new Actions(driver);
		 a.moveToElement(teens_kids).perform();
		 tops.click();
		 colorfilter.click();
		 white.click();
		 Thread.sleep(3000);
		// driver.close();
		 
		 
		 
		 
	 }
	
}
