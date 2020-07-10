package stepdefinition;

import org.testng.annotations.Parameters;

import base.Base;
import booking_Login_Page.BookinPage;
import booking_Login_Page.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends Base {
	
	
	
	@Given("^Initializing the browser and open the url$")
	public void initializing_the_browser_and_open_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("Trying to open portal");
		SearchPage.openportal();
	}

	@When("^Enter the flight details Bengaluru and Delhi$")
	public void enter_the_flight_details_Bengaluru_and_Delhi() throws InterruptedException  {
	   
		System.out.println("Entering flight details");
		SearchPage.Enterflightdetails();
	}

	@When("^search for flight$")
	public void search_for_flight() {
	    
		System.out.println("clicking on search");
		SearchPage.searchflight();
	}

	@Then("^able to select best flight$")
	public void able_to_select_best_flight()  {
	    
		System.out.println("Selecting best flight for your journey");
		BookinPage.selectbestflight();
		System.out.println("Hope this is the best flight for your journey");
	    
	}
	@Then("^close the browser$")
	public void close_the_browser() {
	    
	    //Just to make my result visible  not closing browser else we can uncomment it to close the browser aswell.
		//BookinPage.closedriver();
	}

}
