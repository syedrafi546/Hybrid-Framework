package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By click=By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[3]/div");
	public LandingPage(WebDriver driver2) {
		driver=driver2;
	}

	 
	 
	public WebElement click()
	{
		return driver.findElement(click);
	}
	

}
