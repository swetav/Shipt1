package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShiptHomePage {
	
	WebDriver driver;
	
	public ShiptHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		PageFactory.initElements(driver,  this);
	}
	
	
	@FindBy(xpath="//*[@id=\'search\']")//search field
	WebElement search;

			
	@FindBy(xpath="//*[@id=\"homeIonContent\"]/div/div/shipt-web-header/div/div/div[2]/form/button")//search icon
	WebElement icon;
	
	@FindBy(xpath="/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div/shipt-web-subheader/div/div/button[1]")
	WebElement category;//category
	
	@FindBy(name="Beer")
	WebElement Beer;//Beer
	
	@FindBy(xpath="/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[7]/ion-content/div/div/div[2]/div/div/div[1]/ion-item/div[1]/div[2]/button[2]")
	WebElement PlusAddButton;//+ADD button
	
	@FindBy(xpath="/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[8]/ion-content/div/shipt-web-header/div/div/web-cart-button/button")
	WebElement Cart;//Cart
	
	@FindBy(xpath="/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[8]/ion-content/div/div/div[2]/div/div/div[2]/button")
	WebElement Checkout;//Checkout
	
	@FindBy(xpath="/html/body/div[6]/div[2]/div/shipt-web-modal/div/div[1]/div/div/div/div/ng-transclude")
	WebElement AcceptTerms;//Accept Terms
	
	
	
	
	
		
	
	//WebdriverWait d = new WebDriver(driver, 20);
		//d.until(ExpectedCondition.visibilityOfElementLocated(give the xpath of the element));
	

	
	
		public WebElement search()	{
			return search;
		}
	
		public WebElement icon(){

			return icon;		
		}
	
		public WebElement category()	{

			return category;
		                             }
		public WebElement Beer()	{

			return Beer;
		                             }
		public WebElement PlusAddButton()	{

			return PlusAddButton;
		                             }
		public WebElement Cart()	{

			return Cart;
		                             }
		public WebElement Checkout()	{

			return Checkout;
		                             }
		public WebElement AcceptTerms()	{

			return AcceptTerms;
		                             }
	
	
}




