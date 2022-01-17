package uistore;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.rentalcheckPage;
import resources.base;

public class rentalcheck_ui extends base {
	public static Logger log = LogManager.getLogger(rentalcheck_ui.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void rentalcheck() throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
		//Thread.sleep(3000);
		log.info("navigated to url ");
		rentalcheckPage rc=new rentalcheckPage(driver);
		rc.getcarrental().click();
		log.info("car rental is avalible at user location");
 
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 
}