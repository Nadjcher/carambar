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

public class PanierAddCodeStepDefinition extends BaseStepDefinition {
	
	@Before
    @Override
    public void init() {
       super.init();
    }
	

	    @Given("^the user go to \"([^\"]*)\" page$")
	    public void the_user_go_to_something_page(String pagename) throws Throwable {
	    	page = pagename;
		     String url = BasePage.PAGE_URLS.get(pagename);
		    BasePage.driver.get(url);
	    }
	    @And("^User decline all coockies$")
	    public void user_decline_all_coockies() throws Throwable {
	    	getPage(BasePage.driver).RefusCoockies();
	    }
	    
	    @When("^User connect by tap on sign in button$")
	    public void user_connect_by_tap_on_sign_in_button() throws Throwable {
	    	getPage(BasePage.driver).setConnection();
	    }

	    @Then("^User refer to \"([^\"]*)\" page and enters \"([^\"]*)\" \"([^\"]*)\"$")
	    public void user_refer_to_something_page_and_enters_something_something(String pagename,String email, String password) throws Throwable {
	    	page = pagename;
	    	assertUrl(pagename);
	    	new LoginPage(BasePage.driver).loginConnexion(email,password);
	    	new LoginPage(BasePage.driver).clickConnecteToi();
	    }

	    @Then("^User back \"([^\"]*)\" page by click in image logo$")
	    public void user_back_something_page_by_click_in_image_logo(String pagename) throws Throwable {
	    	new LoginPage(BasePage.driver).clickLogo();
	    	page=pagename;
	    	assertUrl(pagename);	    	
	    	//getPage(BasePage.driver).clickLogo();
	    }

	    @Then("^User tap on promotion link to return \"([^\"]*)\" page$")
	    public void user_tap_on_promotion_link_to_return_something_page(String pagename) throws Throwable {
	    	new HomePage(BasePage.driver).accesPromotions();
	    	page = pagename;
	    	assertUrl(pagename);
	    	
	    }

	    @Then("^User tap on command the first product left and command$")
	    public void user_tap_on_command_the_first_product_left_and_command() throws Throwable {
	    	new PromotionsPage(BasePage.driver).clicklinkProdctPromo();
	    	//getPage(BasePage.driver).clickajoutPanier();
	        //getPage(BasePage.driver).CommandeBtn(BasePage.driver);
	    }

	    @Then("^User confirm the command$")
	    public void user_confirm_the_command() throws Throwable {
	    	new PromotionsPage(BasePage.driver).CommandeBtn(BasePage.driver);
	        //getPage(BasePage.driver).CommandeBtn(BasePage.driver);
	    }

	    @Then("^User fill in the buy product and add \"([^\"]*)\"$")
	    public void user_fill_in_the_buy_product_and_add_something(String codepromotion) throws Throwable {
	    	new PanierPage(BasePage.driver).setCodePromo(codepromotion);
	    	//new PanierPage(BasePage.driver).ClickCommandBtn();
	    }

	    @Then("^A success message appear$")
	    public void a_success_message_appear() throws Throwable {
	    	String MessageActual = new PanierPage(BasePage.driver).MessageAjoutCode();
	    	System.out.println(MessageActual);
	    	Assert.assertTrue(MessageActual.contains("succés"));
	    }


	    

	    
}
