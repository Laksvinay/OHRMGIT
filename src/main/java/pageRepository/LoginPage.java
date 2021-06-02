package pageRepository;

import org.openqa.selenium.By;
import businessFunctions.BaseClass;
import configurations.Config;

public class LoginPage extends BaseClass {

//static WebDriver driver=null;
	
	public static By txtUserName=By.id("txtUsername");
	public static By txtPassword=By.id("txtPassword");
	public static By btnLogin=By.id("btnLogin");
	
	
	public static void enteruserName()
	{
		 driver.findElement(txtUserName).sendKeys(Config.getPropertyValue("username"));
	}
	public static void enterPassword()
	{
		driver.findElement(txtPassword).sendKeys(Config.getPropertyValue("password"));
	}
	public static void clickLogout()
	{
		driver.findElement(btnLogin).click();
	}
}
