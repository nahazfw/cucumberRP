package com.rp.pages.login;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.rp.constants.Constants;
//import com.rp.pages.pricechangerequest.PriceChangeRequest;



public class loginPage {
	private WebDriver driver;
	public Logger log = LogManager.getLogger(loginPage.class.getName());
	private WebDriverWait wait;

	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT));
	}

	
//	@FindBy(id = Constants.USER_NAME_FIELD_PATH)
//	WebElement userName;
//	
//	@FindBy(id=Constants.PASSWORD_FIELD_PATH)
//	WebElement password;
	
	
	 @FindBy(id = "name")
	 WebElement USER_NAME_FIELD_PATH;
	 
	 @FindBy(id="password")
	 WebElement PASSWORD_FIELD_PATH;
	 
	 @FindBy(id="login")
	 WebElement LOG_IN_BUTTON;

	

	public void enterUsername(String username) {
		USER_NAME_FIELD_PATH.sendKeys(username);
		log.info("Entered search key: "+username);		
	}
	
	public void enterPassword(String password)
	{
		PASSWORD_FIELD_PATH.sendKeys(password);
		log.info("Entered search key: "+password);
	}
 
	public void clickLogin()
	{
		LOG_IN_BUTTON.click();
	}
	
}



