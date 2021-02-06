package Object_Repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailLoginPage {

	WebDriver driver;
	
	//constructor name same as class
	public  gmailLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By email=By.id("email");
	By password=By.id("pass");
	By loginButton=By.xpath("//input[@id='u_0_b']");
	
	public WebElement EMAIL()
	{
		return driver.findElement(email);
	}
	
	public WebElement PASSWORD()
	{
		return driver.findElement(password);
	}
	public WebElement LOGIN()
	{
		return driver.findElement(loginButton);
	}
	
	}
