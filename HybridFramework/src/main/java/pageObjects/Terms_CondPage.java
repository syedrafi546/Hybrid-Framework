package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Terms_CondPage {
	public WebDriver driver;
	By term=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-sitemap/div[2]/div/div[1]/ul/li[3]/a");
	public Terms_CondPage(WebDriver driver2) {
		driver=driver2;
	}
  
	public WebElement getterms()
	{
		return driver.findElement(term);
	}
	 

}
