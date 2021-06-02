package businessFunctions;

import java.util.concurrent.TimeUnit;

import pageRepository.HomePage;
import pageRepository.LoginPage;

public class LoginLogoutFunctions extends BaseClass {

	public static void login()
	{
		LoginPage.enteruserName();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        LoginPage.enterPassword();
        LoginPage.clickLogout();
	}
	public static void logout()
	{
		HomePage.clickWelcome();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		HomePage.clickLogout();

	}
}
