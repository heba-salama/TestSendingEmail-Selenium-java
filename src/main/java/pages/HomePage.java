package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(linkText = "Sign in")
	WebElement signInLink;
	
	public void openSignInPage() 
	{
		signInLink.click();
	}

}