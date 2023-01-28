package carambarStepDefinition;

import org.junit.Assert;

import Runner.DriverManager;
import carambarCoPage.BasePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PromotionsStepDefinition extends BaseStepDefinition {
	

	@Before
    @Override
    public void init() {
       super.init();
    }
	
    @Given("^User begin by visiting the \"([^\"]*)\" page$")
    public void user_begin_by_visiting_the_something_page(String pagename) throws Throwable {
    	page = pagename;
	    String url = BasePage.PAGE_URLS.get(pagename);
	    BasePage.driver.get(url);
    }

    @When("^User select the first lift product$")
    public void user_select_the_first_lift_product() throws Throwable {
    	getPage(BasePage.driver).clicklinkProdctPromo();
    }

    @Then("^User get the command in the basket in \"([^\"]*)\" page$")
    public void user_get_the_command_in_the_basket_in_something_page(String pagename) throws Throwable {
    	page = pagename;
	    String expectedUrl = BasePage.PAGE_URLS.get(pagename);
	    String actualUrl = BasePage.driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
    	//String nomProduitActuel = getPage(BasePage.driver).NameProductinPanier();
		//String nomProduitExpected = getPage(BasePage.driver).getNameProductInBonbonPage();
		//Assert.assertEquals(nomProduitExpected, nomProduitActuel);
    }

    @And("^User click on refuse the coockies$")
    public void user_click_on_refuse_the_coockies() throws Throwable {
    	getPage(BasePage.driver).RefusCoockies();
    }

    @And("^User click on promotions$")
    public void user_click_on_promotions() throws Throwable {
    	getPage(BasePage.driver).accesPromotions();
    }

    @And("^Use is on \"([^\"]*)\" page$")
    public void use_is_on_something_page(String pagename) throws Throwable{
    	page = pagename;
	    String expectedUrl = BasePage.PAGE_URLS.get(pagename);
		String actualUrl = BasePage.driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
    }
    
    @And("^user add the product to panier$")
    public void user_add_the_product_to_panier() throws Throwable {
    	getPage(BasePage.driver).clickajoutPanier();
        getPage(BasePage.driver).CommandeBtn(BasePage.driver);
    }
}
