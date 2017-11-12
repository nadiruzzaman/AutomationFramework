package com.framework.automation.framework.applicationAction;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.automation.framework.homePage.VerifyloginWithInvalidCredentails;

public class HomePage {
	public static final Logger log=Logger.getLogger(HomePage.class.getName());

	WebDriver driver;
	
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement logInemailAddress;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement logInPassword;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	WebElement submitButton;

	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement authenticationValid;
	
	@FindBy(xpath=".//*[@id='email_create']")
	WebElement EmailAddress;
	
	@FindBy(xpath=".//*[@id='SubmitCreate']")
	WebElement SubmitCreatbutton;
	
	@FindBy(xpath=".//*[@id='create_account_error']/ol/li")
	WebElement InValidEmailAddress;
	
	@FindBy(xpath=".//*[@id='noSlide']/h1")
	WebElement validCreatedAccount;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}

	public void logInToApplication(String emailAddress, String password){
		signIn.click();
		log.info("Click signIn and object is : "+signIn.toString());
		logInemailAddress.sendKeys(emailAddress);
		log.info("Enterd login and object is : "+logInemailAddress.toString());
		logInPassword.sendKeys(password);
		log.info("Enterd password and object is : "+logInPassword.toString());
		submitButton.click();
		log.info("Click submitButton and object is : "+submitButton.toString());
	}
	public void correctCreateAccount(String emailAddress){
		signIn.click();
		log.info("Click signIn and object is : "+signIn.toString());
		EmailAddress.sendKeys(emailAddress);
		log.info("Enter valid EmailAddress : "+EmailAddress.toString());
		SubmitCreatbutton.click();
		log.info("Click submitCreateButton and object is : "+SubmitCreatbutton.toString());
	}
	public String getInvalidLogInText(){
log.info("Error message is : "+authenticationFailed.getText());
		return authenticationFailed.getText();
	}
	
	public String getValidLogInText(){
		log.info("Valid message is : "+authenticationValid.getText());
				return authenticationValid.getText();
			}
	
	public String validCreateAccount(){
		log.info("Valid message is : "+validCreatedAccount.getText());
				return validCreatedAccount.getText();
}
}