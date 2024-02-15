package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SassafrasCreateAcc {
	

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div/div/div/div/a[2]")
	WebElement AccIcon;
	@FindBy(xpath = "//*[@id=\"customer_login\"]/span/a")
	WebElement CreateLink;
	@FindBy(id = "customer[first_name]")
	WebElement firstnameFld;
	@FindBy(id = "customer[last_name]")
	WebElement lasttnameFld;
	@FindBy(id = "customer[email]")
	WebElement emailFld;
	@FindBy(id = "customer[password]")
	WebElement passwordFld;
	@FindBy(xpath = "//*[@id=\"register-customer\"]/button/span[1]")
	WebElement createBtn;

	public SassafrasCreateAcc(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public void createAccount(String fname, String lname, String email, String password)
	{
		AccIcon.click();
		CreateLink.click();
		firstnameFld.sendKeys(fname);
		lasttnameFld.sendKeys(lname);
		emailFld.sendKeys(email);
		passwordFld.sendKeys(password);
		createBtn.click();
		
	}
}
