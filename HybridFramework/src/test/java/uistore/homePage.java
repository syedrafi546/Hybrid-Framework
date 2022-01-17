package uistore;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class homePage extends base {
	public static Logger log = LogManager.getLogger(homePage.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void basePageNavigation() throws IOException 
	{
		driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		log.info("open url");
		//lp.getLogin().click();
		lp.click().click();
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 

}
