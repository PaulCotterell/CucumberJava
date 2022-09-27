package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
	
	WebDriver driver;

	@FindBy(id = "name")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id = "login")
	@CacheLookup
	WebElement btnLogin;
	
	
	/**
	 * Example FindBys
	 * 
	 * find list of elements
	 * @FindBy(partialLinkText = "Paul")
	 * List<WebElement> myLinks;
	 * 
	 * equivalent to @FindBy(id = "name")
	 * @FindBy(how = How.ID, using = "name")
	 * WebElement abc;
	 * 
	 */	
	
	public LoginPagePF(WebDriver driver) {
		this.driver = driver;
		
		//we can use the following for non-dynamic page elements
		PageFactory.initElements(driver, this);
		
		/**
		 * for dynamic Ajax elements we can do the following which has a timeout of 30 secs
		 * which gives the dynamic elements time to load
		 * 
		 * AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		 * PageFactory.initElements(factory, this);
		 */
	}
	
	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
}
