package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.ShiptHomePage;
import ObjectRepository.ShiptLoginPage;

public class Loginapplication {
	
	@Test
	
	public void Login() 
	{
	
	System.setProperty("webdriver.chrome.driver", "/Users/parents/Desktop/workspace/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shipt.com");
	ShiptLoginPage rd = new ShiptLoginPage(driver);
	
	rd.LogInbutton().click();//Login
	rd.EmailId().sendKeys("qatest@shipt.com");//username
	rd.Password().sendKeys("Sh1pt123!");//password
	rd.Submit().click();//submit
	
	ShiptHomePage rh = new ShiptHomePage(driver);
	
	

	rh.search().sendKeys("milk");//search field
	rh.icon().click();//search icon
	rh.category().click();//shop by category drop-down
	rh.Beer().click();//Beer
	rh.PlusAddButton().click();//Beer
	rh.Cart().click();//Beer
	rh.Checkout().click();//Beer
	rh.AcceptTerms().click();//Beer
	
	

}
}
