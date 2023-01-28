package carambarStepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Runner.DriverManager;
import carambarCoPage.BasePage;
import carambarCoPage.ConnexionPage;
import carambarCoPage.HomePage;
import carambarCoPage.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnexionStepDefinition extends BaseStepDefinition  {
	

	@Before
    @Override
    public void init() {
       super.init();
    }

	 @Given("^I have navigated to the CarambarCo \"([^\"]*)\" page$")
	    public void i_have_navigated_to_the_carambarco_something_page(String pagename) throws Throwable {
		    page = pagename;
			String url = BasePage.PAGE_URLS.get(pagename);
			BasePage.driver.get(url);
	}
	 
	@When("^User refuse coockies$")
	 public void user_refuse_coockies() throws Throwable {
		getPage(BasePage.driver).RefusCoockies();	
	 }
	 
	 @And("^User clicks on connecte toi$")
	    public void user_clicks_on_connecte_toi() throws Throwable {
		 getPage(BasePage.driver).setConnection();
		
	    }
	 
	 
	 @Then("^User directed to page \"([^\"]*)\"$")
	    public void user_directed_to_page_something(String pagename) throws Throwable {
		 page = pagename;
         String expectedUrl = BasePage.PAGE_URLS.get(pagename);
		 String actualUrl = BasePage.driver.getCurrentUrl();
         //Assert.(expectedUrl,actualUrl);
         //Assert.assertTrue(expectedUrl, actualUrl.contains(expectedUrl) );
	    }


	    @Then("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void user_enters_something_something_something_something(String firstname, String lastname, String email, String password )throws Throwable {
	        getPage(BasePage.driver).setCreationCompte();
	        
	    	 getPage(BasePage.driver).creatNewClient( firstname, lastname, email, password );
	    }

	    @And("^User clicks on register$")
	    public void user_clicks_on_register() throws Throwable {
	    	getPage(BasePage.driver).setEnregistrer();
	    }
	    
	    
	    @Then("^Redirected to page\"([^\"]*)\" and compt name with \"([^\"]*)\" \"([^\"]*)\"$")
	    public void redirected_to_pagesomething_and_compt_name_with_something_something(String pagename, String firstname, String lastname) throws Throwable {
	    	page = pagename;
	        String expectedUrl = BasePage.PAGE_URLS.get(pagename);
			String actualUrl = BasePage.driver.getCurrentUrl();
	        Assert.assertEquals(expectedUrl,actualUrl);
	        String actualdName = getPage(BasePage.driver).getNameCompte();
	        String expectedName = firstname+" "+ lastname;
	        Assert.assertEquals(expectedName,actualdName);
	    }

	    

}
