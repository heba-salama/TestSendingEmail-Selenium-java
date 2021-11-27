package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendEmailPage extends BasePage{
	

	public SendEmailPage(WebDriver driver)	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div/div[1]/div[2]/div/div/button")
	WebElement newMessage;
	
	@FindBy(xpath = "//div[@class='ms-BasePicker-text pickerText_cc9894a7']/input")
	WebElement to;
	
	@FindBy(xpath = "//div[@id='suggestionHeader-list']")
	WebElement toSubmit;
	
	@FindBy(xpath = "//div[@class='ms-TextField-wrapper']/div/input")
	WebElement subject;
	
	@FindBy(id = "virtualEditScroller120")
	WebElement emailBody;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/span/div/div/div/div/div[1]/div[3]/button/span")
	WebElement attach;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/span/div/div/div/div/div[1]/div[2]/button")
	WebElement sendButton;
	
	public void sendMail(String sendTo, String mailSubject,String filePath) throws InterruptedException 
	{
		newMessage.click();
		Thread.sleep(6000);
		
		to.sendKeys(sendTo);
//		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		toSubmit.click();
		subject.sendKeys(mailSubject); 
		Thread.sleep(5000);
		
		attach.sendKeys(filePath);
				
		sendButton.click();
		
		
	}
	


}
