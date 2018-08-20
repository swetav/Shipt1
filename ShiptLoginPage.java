package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ShiptLoginPage {
	
	WebDriver driver;
	public ShiptLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
			
	}
	
	
	By Loginbutton = By.xpath("//*[@id=\"main\"]/div[1]/header/nav/a[6]");//Login button
	By Username = By.xpath("/html/body/div[3]/div[2]/div/div/ion-content/div/div/div/div[2]/form/div/label[1]/input");//Username
	By Password = By.xpath("/html/body/div[3]/div[2]/div/div/ion-content/div/div/div/div[2]/form/div/label[2]/input");//Password
	By Submit = By.xpath("//*[@id=\"start_shopping_login_button\"]");//LoginButton
	
	
	public WebElement LogInbutton() {
		return driver.findElement(Loginbutton);
	}
	
	public WebElement EmailId() {
		return driver.findElement(Username);
	}
	
	public WebElement Password() {
		return driver.findElement(Password);
	}
	
	public WebElement Submit() {
		return driver.findElement(Submit);
	}
	

}
