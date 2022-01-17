package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContInfoPage {
	public WebDriver driver;
	By cont=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-sitemap/div[2]/div/div[1]/ul/li[11]/a");
	public ContInfoPage(WebDriver driver2) {
		driver=driver2;
	}
  
	public WebElement getcont()
	{
		return driver.findElement(cont);
	}
	 
}
