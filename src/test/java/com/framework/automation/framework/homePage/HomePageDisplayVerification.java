package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;

public class HomePageDisplayVerification extends TestBase {
	public static final Logger log = Logger.getLogger(HomePageDisplayVerification.class.getName());
	HomePage homepage;

	@BeforeTest
	public void setup() throws IOException {
		init();
	}

	@Test
	public void WomenDressButton() {
		log.info("***********Verified WomendressButton Test************");
		homepage = new HomePage(driver);
		homepage.VerifiedWomenButton();
		log.info("***********Finish WomendressButton Test************");

	}

	
	@Test
	public void verifyContactPageHomeLogo(){
	 log.info("***********HomePageDisplayVerificationTest************");
	 homepage = new HomePage(driver);
	 homepage.verifyContactHomeLogo();
	 log.info("***********Finish vrifiedHomePageshoppingChartButtonDisplayed Test************");
}

	
	@AfterTest
	public void end() {
		driver.close();

	}
	

}
