package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qaclickacademy.LandingPage;
import qaclickacademy.driverProvider;

public class setpDefination extends driverProvider{
	@Given("^User is on Landing page \"([^\"]*)\"$")
	public void user_is_on_Landing_page(String arg1) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver = Initialization();
		driver.get(arg1);
	}

	  @When("^User login into the application with valid (.+)$")
	    public void user_login_into_the_application_with_valid(String username) throws Throwable {
		LandingPage lp= new LandingPage(driver);
		lp.getsignin().click();
		lp.getUsername().sendKeys(username);
	    
	}
	
	 @And("^User has to click on Next button$")
	    public void user_has_to_click_on_next_button() throws Throwable {
		 LandingPage lp= new LandingPage(driver);
		 lp.getNext().click();
	    }

	    @Then("^Enter the password (.+)$")
	    public void enter_the_password(String password) throws Throwable {
		 LandingPage lp= new LandingPage(driver);
		 lp.getPassword().sendKeys(password);
	    }
	 
	 @And("^Home page is displayed $")
	    public void home_page_is_displayed() throws Throwable {
		 LandingPage lp= new LandingPage(driver);
		 Assert.assertTrue(lp.getsearchBox().isDisplayed());
	    }

		    }

