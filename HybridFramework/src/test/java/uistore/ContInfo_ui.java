package uistore;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ContInfoPage;
import pageObjects.rentalcheckPage;
import resources.base;

public class ContInfo_ui extends base {
	public static Logger log = LogManager.getLogger(ContInfo_ui.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void ContInfo() throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
		log.info("navigated to url ");
		ContInfoPage ct=new ContInfoPage(driver);
		ct.getcont().click();
		log.info("Contact Info of savaari are displayed");
 
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 
}