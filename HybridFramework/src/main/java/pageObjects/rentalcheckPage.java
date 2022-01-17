package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rentalcheckPage {
	public WebDriver driver;
	By down=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/app-footer/footer/div[1]/div[3]/ul/li[2]/a");
	By carrental=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-sitemap/div[2]/div/div[1]/ul/li[9]/a");
	By location=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-seo-citylist/div/ul/li[280]/a");
	public rentalcheckPage(WebDriver driver2) {
		driver=driver2;
	}
  
	public WebElement getcarrental()
	{
		return driver.findElement(carrental);
	}
	public WebElement getlocation() {
		return driver.findElement(location);
	}
	public WebElement getdown()
	{
		return driver.findElement(down);
	}

}
