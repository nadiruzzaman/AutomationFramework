package com.framework.automation.framework.applicationAction;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	public static final Logger log=Logger.getLogger(HomePage.class.getName());

	WebDriver driver;
	
	
	@FindBy(xpath=".//nav/div[@class='header_user_info']/a['Sign in']") WebElement signIn;
	
	@FindBy(id="email") WebElement logInemailAddress;
	
	@FindBy(id="passwd") WebElement logInPassword;
	
	@FindBy(id="SubmitLogin") WebElement submitLogInButton;

	@FindBy(xpath=".//ol/li['Authentication failed.']") WebElement authenticationFailed;
	
	@FindBy(xpath=".//nav/div[@class='header_user_info']/a[@title='View my customer account']/span['k u']") WebElement authenticationValidWithAccountName;
	
	@FindBy(id="email_create") WebElement EmailAddressForCreateAccount;
	
	@FindBy(id="SubmitCreate") WebElement SubmitCreatAnAccountbutton;
	
	@FindBy(xpath=".//div[@class=\"col-sm-4 clearfix\"]/div[@class='shopping_cart']/a[@ title='View my shopping cart']") WebElement shoppingChartFromHomePage;
	
	@FindBy(xpath=".//h1['Create an account']") WebElement validCreatedAccount;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li['Dresses']/a[@title='Dresses']") WebElement dressButtonFromHomepage;
	
	@FindBy(xpath=".//*[@id='columns']/div[@class=\"breadcrumb clearfix\"]") WebElement WomenButton;

	@FindBy(xpath=".//*[@id='contact-link']/a['@ title=Contact Us']") WebElement ClickContactUsButton;
	
	@FindBy(xpath=".//a[@title='Return to Home']/i['@class=\"icon-home\"']") WebElement VarifiedContactHomeLogo;
	@FindBy(xpath=".//*[@id='home-page-tabs']/li[@class='active']/a['Best Sellers']") WebElement bestSellersButton;
	
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
		submitLogInButton.click();
		log.info("Click submitButton and object is : "+submitLogInButton.toString());
	}
	public void correctCreateAccount(String emailAddress){
		signIn.click();
		log.info("Click signIn and object is : "+signIn.toString());
		EmailAddressForCreateAccount.sendKeys(emailAddress);
		log.info("Enter valid EmailAddress : "+EmailAddressForCreateAccount.toString());
		SubmitCreatAnAccountbutton.click();
		log.info("Click submitCreateButton and object is : "+SubmitCreatAnAccountbutton.toString());
	}
	
	public void vrifiedHomePageshoppingchart(){
		shoppingChartFromHomePage.isDisplayed();
		 		log.info(" shoppingchart object is : "+shoppingChartFromHomePage.toString());
	}
		 		public void vrifybestSellersButtonInHomepgae(){
		 			bestSellersButton.isDisplayed();
		 			log.info("bestSellersButton");
	
	
	}	 
		 public String getInvalidLogInText(){
log.info("Error message is : "+authenticationFailed.getText());
		return authenticationFailed.getText();
	}
	
	public String getValidLogInText(){
		log.info("Valid message is : "+authenticationValidWithAccountName.getText());
				return authenticationValidWithAccountName.getText();
			}
	
	public String validCreateAccount(){
		log.info("Valid message is : "+validCreatedAccount.getText());
				return validCreatedAccount.getText();
	}	
	public boolean VerifiedWomenButton(){
		try{
		dressButtonFromHomepage.click();
		WomenButton.isDisplayed();
		Assert.assertEquals(WomenButton, WomenButton);
		log.info(WomenButton);
		return true;
	} catch (Exception e) {
		return false;
		}
	}

	public boolean verifyContactHomeLogo() {
		try{
		ClickContactUsButton.click();
		VarifiedContactHomeLogo.isDisplayed();
		Assert.assertEquals(VarifiedContactHomeLogo, VarifiedContactHomeLogo);
		log.info(VarifiedContactHomeLogo);
		return true;
		
		}catch (Exception e) {
			return false;
			}
	}
}

