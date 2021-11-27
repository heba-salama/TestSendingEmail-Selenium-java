package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import data.LoadProperties;

public class TestBase {
		
	public static WebDriver driver;

	
	@BeforeSuite
	public void openDriver()
	{
		String url = LoadProperties.userData.getProperty("URL");

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}
	
}