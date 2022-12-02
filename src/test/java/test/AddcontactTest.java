package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddcontactPage;
import page.DashBoardpage;
import page.LoginPage;
import util.BrowserFactory;

public class AddcontactTest {
	WebDriver driver;
@Test
	public void UserShouldBeAbleTogotoAddContactPage() {

		driver = BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUsername("demo@techfios.com");
		loginpage.insertPassword("abc123");
		loginpage.clickSIgninButton();

		DashBoardpage dashboardpage = PageFactory.initElements(driver, DashBoardpage.class);
		dashboardpage.validateDashboardpage("Dashboard");
		dashboardpage.customerMenuButton();
		dashboardpage.addCustomerButton();
		
		AddcontactPage addcontactpage= PageFactory.initElements(driver, AddcontactPage.class);
		addcontactpage.validateAddcontactPage("Add Contact");
		addcontactpage.insertfullNameButton("December Selenim 2021");
		addcontactpage.selectCompanyName("Techfios");
		addcontactpage.insertemailaddress("siminkazi@techfios.com");

	}
}