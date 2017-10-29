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
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}

	public void logInToApplication( String password,String emailAddress){
		signIn.click();
		log.info("Click signIn and object is : "+signIn.toString());
		logInemailAddress.sendKeys(emailAddress);
		log.info("Enterd login and object is : "+logInemailAddress.toString());
		logInPassword.sendKeys(password);
		log.info("Enterd password and object is : "+logInPassword.toString());
		submitButton.click();
		log.info("Click submitButton and object is : "+submitButton.toString());
	}
	
	public String getInvalidLogInText(){
log.info("Error message is : "+authenticationFailed.getText());
		return authenticationFailed.getText();
	}
	
}
