package tests;

import org.testng.annotations.Test;

import data.LoadProperties;
import pages.HomePage;
import pages.SendEmailPage;
import pages.SignInPage;

public class TestSendMail extends TestBase {
	
	HomePage homeObj;
	SignInPage signInObj;
	SendEmailPage sendEmailObj;
	
	@Test(priority=0)
	public void outlookSignIn() throws InterruptedException
	{
		
		String email = LoadProperties.userData.getProperty("EMAIL");
		String password = LoadProperties.userData.getProperty("PASSWORD");
		String sendTo = LoadProperties.userData.getProperty("To");
		String mailSubject = LoadProperties.userData.getProperty("SUBJECT");
		String filePath = System.getProperty("user.dir")+"/uploads/Data.xlsx";

		homeObj = new HomePage(driver);
		homeObj.openSignInPage();
		
		signInObj = new SignInPage(driver);
		signInObj.outlookSignIn(email, password);
		
		sendEmailObj = new SendEmailPage(driver);
		sendEmailObj.sendMail(sendTo, mailSubject, filePath);
		
		
			
	}
	
}