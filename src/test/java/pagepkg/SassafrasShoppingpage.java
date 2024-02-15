package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class SassafrasShoppingpage {

	WebDriver driver;
	//*[@id="main"]/div/section/div/div/div/ul/li[2]/a"
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/store-header/div/div/div/div/a[2]")
	WebElement AccIcon;
	@FindBy(xpath = "//*[@id=\"customer[email]\"]")
	WebElement emailFld;
	@FindBy(xpath = "//*[@id=\"customer[password]\"]")
	WebElement pswdFld;
	@FindBy(xpath = "//*[@id=\"customer_login\"]/button/span[1]")
	WebElement LoginBtn;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--21715383550253__main\"]/section/div[3]/div/div[1]/div/div/a")
	WebElement shopping;
	@FindBy(xpath = "//*[@id=\"facet-main\"]/div/div/div/button")
	WebElement sort;
	@FindBy(xpath = "//*[@id=\"sort-by-popover\"]/div/div/label[3]/span")
	WebElement sortoption;
	@FindBy(xpath = "//*[@id=\"facet-main\"]/product-list/div/product-item[8]/div[1]/a")
	WebElement product;
	@FindBy(xpath = "//*[@id=\"swatch-option1\"]/div/fieldset/ul/li[6]/div/div[1]/span")
	WebElement psize;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--21715384402221__main\"]/section/div/div/div/div[1]/div[3]/quantity-selector/button[2]")
	WebElement increaseqty;
	@FindBy(xpath = "//*[@id=\"AddToCart\"]/span[1]")
	WebElement addBtn;
	//@FindBy(xpath = "//*[@id=\"mini-cart-form\"]/line-item/div/div[1]/line-item-quantity/div/a[1]")
	@FindBy(xpath = "//*[@id=\"mini-cart\"]/header/button")
	WebElement closecart;
	@FindBy(xpath = "//*[@id=\"main\"]/div/section/div/div/div/ul/li[2]/a")
	WebElement addressBtn;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--21715383615789__main\"]/section/div[3]/div/div[2]/div/div/div/div/div[2]/button")
	WebElement editBtn;
	@FindBy(xpath = "//*[@id=\"address-9889362837805[phone]\"]")
	WebElement phoneFld;
	@FindBy(xpath = "//*[@id=\"address-9889362837805[province]\"]")
	WebElement province;
	@FindBy(xpath = "//*[@id=\"address_form_9889362837805\"]/button/span[1]")
	WebElement saveBtn;
	@FindBy(xpath = "//*[@id=\"main\"]/div/section/div[1]/div/div/ul/li[3]/a")
	WebElement logoutBtn;
	
	public SassafrasShoppingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 public void AccountBtn()
	 {
		 AccIcon.click();
	
	 }
	 public void login(String email, String pswd) throws InterruptedException
		{
			
			emailFld.clear();
		    pswdFld.clear();
			emailFld.sendKeys(email);
			pswdFld.sendKeys(pswd);
			 LoginBtn.click();
		
		}
	 public void startshopping() throws InterruptedException
	 {
		 shopping.click();
		 sort.click();
		 Thread.sleep(2000);
			sortoption.click();
			
	 }
	 public void selectproduct() throws InterruptedException {
		 
		 	Thread.sleep(2300);
		 	JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,290)", "");
			Thread.sleep(7000);
			product.click();
			Thread.sleep(2000);
			psize.click();
			increaseqty.click();
	 }
	 public void addtocart() throws InterruptedException
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,200)", "");
		 addBtn.click();
		 Thread.sleep(3000);
		 closecart.click();
		 
	 }
	 public void editaddress(String phone)
	 {
		 AccIcon.click();
		 addressBtn.click();
		 editBtn.click();
		 phoneFld.clear();
		 phoneFld.sendKeys(phone);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,200)", "");
		 province.click();
		 Select provincedtls=new Select(province);
		 provincedtls.selectByVisibleText("Kerala");
		 saveBtn.click();
		
	 }
	 
	
	 public void logouttest()
	 {
		 logoutBtn.click();
	 }
}

