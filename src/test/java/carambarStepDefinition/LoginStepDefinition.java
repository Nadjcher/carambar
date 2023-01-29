package carambarStepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Runner.DriverManager;
import carambarCoPage.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseStepDefinition {

	
	@Before
    @Override
    public void init() {
       super.init();
    }
	
	
	   
	@Given("^user navigated to \"([^\"]*)\" page carambar$")
    public void user_navigated_to_something_page_carambar(String pagename) throws Throwable {
    	page = pagename;
		String url = BasePage.PAGE_URLS.get(pagename);
		BasePage.driver.get(url);
    }
    
    @And("^User reject coockies$")
     public void user_reject_coockies() throws Throwable {
		getPage(BasePage.driver).clickrefuseLoginCoockies(); 
    }

    @When("^User enters email as \"([^\"]*)\"  and password as  \"([^\"]*)\"$")
    public void user_enters_email_as_something_and_password_as_something(String email, String password) throws Throwable {
    	getPage(BasePage.driver).loginConnexion(email,password);
    }
	@And("^User submit on Connectetoi$")
    public void user_submit_on_connectetoi() throws Throwable {
    	getPage(BasePage.driver).clickConnecteToi();
    }
	@Then("^user is redirected to the \"([^\"]*)\" page with his \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_redirected_to_the_something_page_with_his_something_and_something(String pagename,String prenom, String nom) throws Throwable {
		page = pagename;
		String expectedUrl = BasePage.PAGE_URLS.get(page);
		String actualUrl = BasePage.driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        String actualdName = getPage(BasePage.driver).getNameCompteLoginPage();
        String expectedName = prenom +" "+ nom;
        Assert.assertEquals(expectedName,actualdName);
	}

    //@After 
	 // public void tearDown() {
		// BasePage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// BasePage.driver.close();
	 // }    
	
}



    
    

    


	
	

