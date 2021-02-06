package Object_Repositories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fbHomePage_Test {


		WebDriver driver;

		public fbHomePage_Test(WebDriver driver) {
			this.driver=driver;
			// TODO Auto-generated constructor stub
		}
		By forgetPassword=By.id("forgot-password-link");
		
		

		public WebElement forgetPassword() {
			// TODO Auto-generated method stub
			return driver.findElement(forgetPassword);
		}


		
}
