package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShiftLoginpagePF {
	
	WebDriver driver;
	public ShiftLoginpagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(xpath="/html/body/div[1]/header/nav/a[6]")
	WebElement LogInbutton;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/ion-content/div/div/div/div[2]/form/div/label[1]/input")
	WebElement EmailId;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/ion-content/div/div/div/div[2]/form/div/label[2]/input")
	WebElement Password;	

	@FindBy(xpath="//*[@id=\"start_shopping_login_button\"]")
	WebElement Submit;
	
   
   
   public WebElement LogInbutton()
   {
	   return LogInbutton;
   }
         
   public WebElement EmailId()
   {
	   return EmailId;
   }
   
  
   public WebElement Password()
   {
	   return Password;
   }
   
   public WebElement Submit()
   {
	   return Submit;
   }
	
}

