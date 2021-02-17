package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseComponents.BaseClass;

public class ObjectRepoLandingPage extends BaseClass

{
	public ObjectRepoLandingPage(WebDriver driver) {
		this.driver=driver;
	}
  
	
	//Watch button
	By watchb = By.xpath("//*[@id=\"__next\"]/header/ul/li[2]/a");
	
	public WebElement watchButton()
	{
		WebElement watchbutton = driver.findElement(watchb);
		return watchbutton;
	}
	By shopb=By.xpath("//*[@id=\"__next\"]/header/ul/li[1]/a");
	public WebElement shopButton()
	{
		WebElement shopButton = driver.findElement(shopb);
		return shopButton;
	}
	
}
