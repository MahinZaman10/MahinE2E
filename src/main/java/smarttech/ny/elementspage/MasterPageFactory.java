package smarttech.ny.elementspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import smarttech.ny.basepage.ParentClass;
import smarttech.ny.generic.CommonUtil;

public class MasterPageFactory extends ParentClass {
	// Initialization Page Factory

	// Page Factory is from Selenium
	// Follow Locator
	// "This" Is a java Reserve key word which refers current class &
	// invokes implecetly

	public MasterPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name='email'])[1]")
	@CacheLookup // to make it perform faster
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		// Right click- GetterSetter Expand and click enter Email
		return enterEmail;

	}

	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup // Helps run faster and properway (Optional)
	private WebElement enterPassword;

	public WebElement getPassword() {
		return enterPassword;

	}

	@FindBy(xpath = "(//button[@type= 'submit'])[1]")
	@CacheLookup
	private WebElement clickOnLoginBTN;
	public WebElement getClickOnLoginBTN() {// use getter method
		return clickOnLoginBTN;
	}


	public void getLogin(String userName, String pwd) {
	getEnterEmail().sendKeys(userName);
	getPassword().sendKeys(pwd);
	getClickOnLoginBTN().click();
}
	

	
}
