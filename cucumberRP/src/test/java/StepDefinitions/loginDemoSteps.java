package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class loginDemoSteps {
WebDriver driver= null;
	@Given("browser is open")
	public void browser_is_open() {
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
	
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	driver.get("https://example.testproject.io/web/");
	
	
	
	}

	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username,String password) {
	driver.findElement(By.cssSelector("#name")).sendKeys(username);
	driver.findElement(By.cssSelector("#password")).sendKeys(password);
	
	
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("//button[@id='login']")).click();
	
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	driver.findElement(By.id("logout")).isDisplayed();
	driver.quit();
	}

}
