package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;


public class VerifyloginWithInvalidCredentails extends TestBase{
	public static final Logger log=Logger.getLogger(VerifyloginWithInvalidCredentails.class.getName());
	HomePage homepage;
	@BeforeTest
	public void setup() throws IOException{
		init();	
	}
 @Test
	public void verifyLoginWithInvalidCredentails(){
	 log.info("***********Starting VerifyloginWithInvalidCredentails Test************");
	 homepage = new HomePage(driver);
	 homepage.logInToApplication("test@gmail.com", "test123");
   
	 Assert.assertEquals(homepage.getInvalidLogInText(),"Authentication failed.");
    log.info("***********Finish VerifyloginWithInvalidCredentails Test************");

	}

	@AfterTest 
	public void end(){
	//driver.close();
		
	}
}
