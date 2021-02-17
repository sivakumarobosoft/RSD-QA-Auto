package stepDefinations;

import baseComponents.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ObjectRepoLandingPage;

public class StepDefinations extends BaseClass {
	
	@Given("^user is already in watch page$")
  	public void user_is_already_in_watch_page()
  	{
		openBrowser();
		
  	}
	@When("^user clicks on watch button$")
	public void user_clicks_on_watch_button()
	{
		ObjectRepoLandingPage lp = new ObjectRepoLandingPage(driver);
		lp.watchButton().click();
	}
	
	@Then("^user navigates to the watch home page$")
	public void user_navigates_to_the_watch_home_page()
	{
		//System.out.println("user is on watch page");
		ObjectRepoLandingPage lp = new ObjectRepoLandingPage(driver);
		lp.checkpageTitle();
		
	}
	@When("^user clicks on shop button$")
	public void user_clicks_on_shop_button()
	{
		ObjectRepoLandingPage lp = new ObjectRepoLandingPage(driver);
		lp.shopButton().click();
	}
}
