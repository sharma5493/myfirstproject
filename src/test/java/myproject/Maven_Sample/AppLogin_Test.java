package myproject.Maven_Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object_Repositories.fbHomePage_Test;
import Object_Repositories.gmailLoginPage;


public class AppLogin_Test {

	@Test
	public void login()

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CG-DTE\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		gmailLoginPage fb= new gmailLoginPage(driver);
		fb.EMAIL().sendKeys("sachin");
		fb.PASSWORD().sendKeys("SHARMA");
		fb.LOGIN().click();
		
		fbHomePage_Test hp=new fbHomePage_Test(driver);
		hp.forgetPassword().click();
	}

}
