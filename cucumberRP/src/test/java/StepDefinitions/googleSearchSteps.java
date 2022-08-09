//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class googleSearchSteps {
//	
//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("browser is open");
//		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		//driver.manage().timeouts().pageLoadTimeout(Duration.of(20, null))
//
//	
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("User is on google search page");
//		driver.navigate().to("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("Test Cucumber");
//		
//		
//	}
//	
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		driver.findElement(By.name("q")).sendKeys("automation step by step");
//	Thread.sleep(2000);	
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);	
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		driver.getPageSource().contains("Online Courses");
//		driver.close();
//	}
//
//}
