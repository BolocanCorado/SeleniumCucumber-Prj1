package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on Login page screen")
	public void user_is_on_login_page_screen() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User landed on the page login page screen");
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Practice Landing page");
	}
	
	@When("User signup into application")
	public void user_signup_into_application(List<String> data ) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}
	
	@When("^User is login into application with (.+) and password (.+)$")
	public void user_is_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username + "and passowrd is " + password);
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@And("Perspective menu is displayed")
	public void perspective_menu_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Perspective is displayed");
	}
	
	@Given("setup the entries in database")
	public void setupEntries() {
		System.out.println("*******");
		System.out.println("Setup the entries in database");
	}
	@When("Launch the browser from config variables")
	public void launchBrowser() {
		System.out.println("*******");
		System.out.println("Launch Browser");
	}
	@When("Hit the home page of banking page")
	public void hitURL() {
		System.out.println("*******");
		System.out.println("Hit the home page of banking page");
	}

}
