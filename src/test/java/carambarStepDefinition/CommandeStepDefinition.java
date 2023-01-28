package carambarStepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Runner.DriverManager;
import carambarCoPage.BasePage;
import carambarCoPage.CommandePage;
import carambarCoPage.HomePage;
import carambarCoPage.LoginPage;
import carambarCoPage.OrderProductWithCodePage;
import carambarCoPage.PanierPage;
import carambarCoPage.PromotionsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommandeStepDefinition extends BaseStepDefinition {
	
	
	@Before
    @Override
    public void init() {
       super.init();
    }
	
	    @Given("^the user is on the \"([^\"]*)\" page$")
	    public void the_user_is_on_the_something_page( String pagename) throws Throwable {
	    	page = pagename;
		     String url = BasePage.PAGE_URLS.get(pagename);
		    BasePage.driver.get(url);
	    }
	    
	    @And("^User click to refuse all coockies$")
	    public void user_click_to_refuse_all_coockies() throws Throwable {
	    	getPage(BasePage.driver).RefusCoockies();
	    }

	    @When("^User clicks sign in button$")
	    public void user_clicks_login_button() throws Throwable {
	    	getPage(BasePage.driver).setConnection();
	    }

	    @Then("^User on \"([^\"]*)\" page and enters \"([^\"]*)\" \"([^\"]*)\"$")
	    public void user_is_in_something_page_and_enters_something_something( String pagename, String email, String password) throws Throwable {
	    	page = pagename;
	    	assertUrl(pagename);
	    	new LoginPage(BasePage.driver).loginConnexion(email,password);
	    	new LoginPage(BasePage.driver).clickConnecteToi();
	    }
	    
	    @Then("^User return \"([^\"]*)\" page by click in image logo$")
	    public void user_return_something_page_by_click_in_image_logo(String pagename) throws Throwable {
	    	new LoginPage(BasePage.driver).clickLogo();
	    	page=pagename;
	    	assertUrl(pagename);	    	
	    	//getPage(BasePage.driver).clickLogo();
	    }
	    
	    
	    
	    
	    @Then("^click on promotion link to return \"([^\"]*)\" page$")
	    public void click_on_promotion_link_to_return_something_page(String pagename) throws Throwable {
	    	new HomePage(BasePage.driver).accesPromotions();
	    	page = pagename;
	    	assertUrl(pagename);
	    	
	    }

	    @Then("^Click to command the first product left and command$")
	    public void click_to_command_the_first_product_left_and_command() throws Throwable {
	    	new PromotionsPage(BasePage.driver).clicklinkProdctPromo();
	    	//getPage(BasePage.driver).clickajoutPanier();
	        //getPage(BasePage.driver).CommandeBtn(BasePage.driver);
	    }

	    @Then("^validate the command$")
	    public void validate_the_command() throws Throwable {
	    	new PromotionsPage(BasePage.driver).CommandeBtn(BasePage.driver);
	        //getPage(BasePage.driver).CommandeBtn(BasePage.driver);
	    }

	    @Then("^Complete the buy product and add \"([^\"]*)\"$")
	    public void complete_the_buy_product_and_add_something( String codepromotion) throws Throwable {
	    	//new PanierPage(BasePage.driver).setCodePromo(codepromotion);
	    	new PanierPage(BasePage.driver).ClickCommandBtn();
	    }
	    
	    
	    @Then("^User complet command by add \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void user_complet_command_by_add_something_something_something_something_something_something_something(String prenom, String nom, String adresse, String codepostal, String ville, String pays, String telephone) throws Throwable {
	    	new CommandePage(BasePage.driver).Commande( prenom,  nom,  adresse, codepostal, ville, pays, telephone);
	    }
	    
	    
}
