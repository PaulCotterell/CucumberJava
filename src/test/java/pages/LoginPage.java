package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;

	private By txtUsername = By.id("name");
	
	private By txtPassword = By.id("password");
	
	private By btnLogin = By.id("login");
	
	private By btnLogout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String username) {
		driver.findElement(txtUsername).sendKeys(username);
	}
	
	public void setPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btnLogin).click();
	}
	
	public void loginUser(String username, String password) {
		setUsername(username);
		setPassword(password);
		clickLogin();
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btnLogout).isDisplayed();
	}
}
