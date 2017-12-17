package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
<<<<<<< HEAD
import org.testng.annotations.AfterTest;
=======
import org.testng.Assert;
>>>>>>> 3869fd2a9b60015dec419b108aa779a7fe0ea63c
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

	@AfterTest
	public void end() {
		driver.close();

	}
<<<<<<< HEAD
=======
	@Test
	public void verifyContactPageHomeLogo(){
	 log.info("***********HomePageDisplayVerificationTest************");
	 homepage = new HomePage(driver);
	 homepage.verifyContactHomeLogo();
	 log.info("***********Finish vrifiedHomePageshoppingChartButtonDisplayed Test************");
}

	
	
>>>>>>> 3869fd2a9b60015dec419b108aa779a7fe0ea63c

}
