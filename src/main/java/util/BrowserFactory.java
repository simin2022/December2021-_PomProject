package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;

// we are using WebDriver as return type so the driver can be available with in the init method for different packages.
	static public WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\simin\\selenium_oct\\pomProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;

	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
