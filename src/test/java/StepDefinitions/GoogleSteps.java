package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSteps {
	
	public WebDriver driver;

	
	@Given("I am on the Google search page")
	public void i_am_on_the_google_search_page() {
		//System.out.println(System.getProperty("user.dir"));
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver105");
		System.setProperty("webdriver.chrome.whitelistedIps", "");
		WebDriverManager.chromedriver().setup();
		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless", "--disable-dev-shm-usage", "--no-sandbox");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://google.com");
	}
	
	@When("I search for {string}")
	public void i_search_for(String search) {
		//accept cookies
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);		
	}
	
	@Then("the page title should start with {string}")
	public void the_page_title_should_start_with(String search) {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().startsWith(search));
		
		driver.close();
		driver.quit();
	}
}
