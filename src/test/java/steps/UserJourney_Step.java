package steps;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.UserJourney_Page;

public class UserJourney_Step extends TestBase {
	
	UserJourney_Page  userjouney = new UserJourney_Page(driver);
	
	@Given("I am in Welcome screen of Betway")
	public void i_am_in_Welcome_screen_of_Betway() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userjouney.isUserInWelcomeScreen();
//		userjouney.loginUser();
//		userjouney.forgotPasswordDetail();
		userjouney.scrollbottom();
		
	   
	}

	@When("I click on forgot password")
	public void i_click_on_forgot_password() {
	    
	}

}
