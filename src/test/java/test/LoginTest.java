package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardpage;
import page.LoginPage;
import util.BrowserFactory;
@Test
public class LoginTest {

WebDriver driver;
	public void UserShouldBeAbleToLogin() {

		driver= BrowserFactory.init();
		
  // To bring the Driver from a class we need to use PageFactory to create an object with in this class. 
		//Object needs to be created since its a different package.
    LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);
    loginpage.insertUsername("demo@techfios.com");
    loginpage.insertPassword("abc123");
    loginpage.clickSIgninButton();
    
    DashBoardpage dashboardpage= PageFactory.initElements(driver, DashBoardpage.class);
    dashboardpage.validateDashboardpage("Dashboard");
    dashboardpage.customerMenuButton();
    dashboardpage.addCustomerButton();;
    BrowserFactory.tearDown();
	}

}
