package com.framework.automation.framework.testBase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	public WebDriver driver;
	private static ChromeDriverService service;
	String url = "http://automationpractice.com/index.php";
	String browser = "chrome";
  //init() method use for browser
	//extends to connected with class
	public void init() throws IOException {
		selectBrowser(browser);
		getUrl(url);
		String Log4jConfigPath = "log4j.properties";
		PropertyConfigurator.configure(Log4jConfigPath);

	}

	public void selectBrowser(String browser) throws IOException {
		if (browser.equalsIgnoreCase("chrome")) {

			service = new ChromeDriverService.Builder().usingDriverExecutable(new File("./driver/chromedriver"))
					.usingAnyFreePort().build();
			service.start();
			log.info("creating object of  " + browser);
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/driver/deckodriver");
			log.info("creating object of  " + browser);
			driver=new FirefoxDriver();

		}

	}

	public void getUrl(String url) {
		log.info("navigating to " + url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

}
