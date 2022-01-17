package uistore;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Terms_CondPage;
import pageObjects.rentalcheckPage;
import resources.base;

public class Terms_Cond_ui extends base {
	public static Logger log = LogManager.getLogger(Terms_Cond_ui.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void TermsConditon() throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
		log.info("navigated to url ");
		Terms_CondPage tc=new Terms_CondPage(driver);
		tc.getterms().click();
	 
		log.info("Terms and conditions are displayed");
 
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 
}