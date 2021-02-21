package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseComponents.BaseClass;

public class ShowLandingPageObjects extends BaseClass 
{
	public ShowLandingPageObjects(WebDriver driver) {
		this.driver=driver;
}
	    //shows button
		By showsb = By.xpath("//*[@id=\"__next\"]/header/ul/li[2]/a");
		//scroll button
		By scrolb = By.xpath("html");// not required
		//All button
		By allb = By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/div/nav/a[1]/span[2]");
		//Home & Design button
		By homdesb = By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/div/nav/a[2]/span[2]");
		//Food button
		By Foodb = By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/div/nav/a[3]/span[2]");
		//Family button
		By Familyb = By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/div/nav/a[4]/span[2]");
		//Farm & Garden button
		By formGardnb = By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/div/nav/a[5]/span[2]");
		//Gathering button
		By Gatheringb = By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/div/nav/a[6]/span[2]");
		//The Pioneer Woman button
		By pioneerwb = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div[2]/a/div/img[2]");
		                         
		//see more in about the show paragraph
		By seeMorepara=By.xpath("//*[@id=\"__next\"]/main/section[3]/div/div/div/div[2]/button");
		//
		
		public WebElement showButton()
		{
			WebElement showButton = driver.findElement(showsb);
			return showButton;
		}
		public WebElement scrolButton()
		{
			WebElement scrolButton = driver.findElement(scrolb);
			return scrolButton;
		}
		public WebElement allButton()
		{
			WebElement allButton = driver.findElement(allb);
			return allButton;
		}
		
		public WebElement HomeDesgButton()
		{
			return driver.findElement(homdesb);
		}
		public WebElement FoodButton()
		{
			return driver.findElement(Foodb);
		}
		public WebElement FamilyButton()
		{
			return driver.findElement(Familyb);
		}
		public WebElement FormGardButton()
		{
			return driver.findElement(formGardnb);
		}
		public WebElement GatherButton()
		{
			return driver.findElement(Gatheringb);
		}
		public WebElement pioneerwButton()
		{
			return driver.findElement(pioneerwb);
		}
		public WebElement seeMorePara()
		{
			return driver.findElement(seeMorepara);
		}
		
}