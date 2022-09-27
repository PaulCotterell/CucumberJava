package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {

	WebDriver driver;
	
	@FindBy(id = "logout")
	@CacheLookup
	WebElement btnLogout;
	
	public HomePagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkLogoutIsDisplayed() {
		btnLogout.isDisplayed();
	}
	
}
