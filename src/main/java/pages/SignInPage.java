package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BasePage{
	

	public SignInPage(WebDriver driver)	{
		super(driver);
	}
	
	@FindBy(id = "i0116")
	WebElement emailInput;
	
	@FindBy(id = "idSIButton9")
	WebElement nextButton;
	
	@FindBy(id = "i0118")
	WebElement passwordInput;
	
	@FindBy(id = "displayName")
	WebElement displayName;
	

	public void outlookSignIn(String email, String password) throws InterruptedException 
	{

		emailInput.sendKeys(email);
		nextButton.click();
		
//		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(displayName));
		
		passwordInput.sendKeys(password);
		nextButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(displayName));
		
		nextButton.click();
		
		
	}
	


}
