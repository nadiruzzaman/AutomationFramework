package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;

public class VerifyloginWithValidCredentails extends TestBase{

	public static final Logger log=Logger.getLogger(VerifyloginWithValidCredentails.class.getName());
	HomePage homepage;
	@BeforeTest
	public void setup() throws IOException{
		init();	
	}
 @Test
	public void verifyLoginWithValidCredentails(){
	 log.info("***********Starting verifyLoginWithValidCredentails Test************");
	 homepage = new HomePage(driver);
	 homepage.logInToApplication("kagim2005@gmail.com", "uddin");
    Assert.assertEquals(homepage.getValidLogInText(),"k u");
    log.info("***********Finish verifyLoginWithValidCredentails Test************");
	}
	
	@AfterTest 
	public void end(){
	driver.close();
		
	}
}
