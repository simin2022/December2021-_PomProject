package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddcontactPage extends BasePage {
	WebDriver driver;

	// this method has been created to evoke the constructor so we can use the same
	// WebDriver driver for different class in a different package.
	public void AddcontactPage(WebDriver driver) {

		this.driver = driver;
	}
      @FindBy(how=How.XPATH,using="//h5[contains(text(), 'Add Contact')]")WebElement Add_Contact_Header_Element;
      @FindBy(how=How.XPATH,using="//input[@id='account']")WebElement Full_Name_Element;
      @FindBy(how=How.XPATH,using="//select[@id='cid']")WebElement Company_Element;
     @FindBy(how=How.XPATH,using="//*[@id='email']")WebElement Email_Address_Element;
      
      public void validateAddcontactPage(String addContact) {
    	  
    	  Assert.assertEquals(Add_Contact_Header_Element.getText(), addContact, "Wrong page");
      }
 public void insertfullNameButton(String fullname) {
    	  
	 Full_Name_Element.sendKeys(fullname + generatedRandomNo(999));
      }
 public void selectCompanyName(String company) {
	selectFromDropdown(Company_Element, company);
	 
 }
 public void insertemailaddress(String email) {
	 Email_Address_Element.sendKeys(generatedRandomNo(999)+ email);	 
	 }
}
