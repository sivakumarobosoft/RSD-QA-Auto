package stepDefinations;

import org.openqa.selenium.JavascriptExecutor;
import baseComponents.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ShowLandingPageObjects;


public class ShowLandingStepDef extends BaseClass{
	
	ShowLandingPageObjects slp;
	@Given("^user is on show landing page$")
	public void user_is_on_show_landing_page() throws Throwable {
		openBrowser();
		lauchShowlanding();
	}

	@Given("^click on shows button$")
	public void click_on_shows_button()
	{
		slp = new ShowLandingPageObjects(driver);
     	slp.showButton().click();
	}

	@When("^user scroll up & down$")
	public void user_scroll_up_down() throws Throwable {
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("window.scroll(0,400)");
	    Thread.sleep(3000);
	    js.executeScript("window.scroll(0,400)");
	}

	@When("^navigate to All$")
	public void navigate_to_All()  {
     	slp.allButton().click(); 
	}

	@When("^navigate to Home & Design$")
	public void navigate_to_Home_Design() throws InterruptedException  {
		Thread.sleep(2000);
		slp.HomeDesgButton().click();   
	}

	@When("^navigate to Food$")
	public void navigate_to_Food() throws Throwable {
		Thread.sleep(2000);
		slp.FoodButton().click();
	}

	@When("^navigate to Family$")
	public void navigate_to_Family() throws Throwable {
		Thread.sleep(1000);
	    slp.FamilyButton().click();
	}

	@When("^navigate to Farm & Garden$")
	public void navigate_to_Farm_Garden() throws Throwable {
		Thread.sleep(1000);
	    slp.FormGardButton().click();
	}

	@When("^navigate to Gathering$")
	public void navigate_to_Gathering() throws Throwable {
		Thread.sleep(1000);
	    slp.GatherButton().click();
	}
	

	@Then("^click on Treat Yourself with Skyler$")
	public void click_on_Treat_Yourself_with_Skyler() throws Throwable {
		Thread.sleep(3000);
       slp.allButton().click();
		Thread.sleep(2000);
	   slp.pioneerwButton().click();
	}
	@Then("^click scrolldown and click seemore")
	public void click_scrolldown_and_click_seemore() throws Throwable {
//		slp.allButton().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		slp.seeMorePara().click();
	}

//	@Then("^click scrolldown and click seemore$")
//	public void check_more_outcomes() throws Throwable {
//		//By seeMorepara=By.xpath("//*[@id=\"__next\"]/main/section[3]/div/div/div/div[2]/button");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,400)");
//		//js.executeScript("arguments[0].scrollIntoView();", "seeMorePara().seeMorepara");
//	    slp.seeMorePara().click();
//	}

	
}
