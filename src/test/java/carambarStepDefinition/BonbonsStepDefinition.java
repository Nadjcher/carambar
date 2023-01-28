package carambarStepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;


import Runner.DriverManager;
import carambarCoPage.BasePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BonbonsStepDefinition extends BaseStepDefinition {
	@Before
    @Override
    public void init() {
       super.init();
    }
	
	

	    @Given("^User visit the \"([^\"]*)\" page$")
	    public void user_visit_the_something_page(String pagename) throws Throwable {
	    	page = pagename;
		    String url = BasePage.PAGE_URLS.get(pagename);
		    BasePage.driver.get(url);
	    }

	    @When("^User select the first bonbon acidulé$")
	    public void user_select_the_first_bonbon_acidul() throws Throwable {
	    	getPage(BasePage.driver).ChooseProductInBonbonPage();
	    }

	    @Then("^User find the command in the basket in \"([^\"]*)\" page$")
	    public void user_find_the_command_in_the_basket_in_something_page(String pagename) throws Throwable {
	    	page = pagename;
		    String expectedUrl = BasePage.PAGE_URLS.get(pagename);
		    String actualUrl = BasePage.driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			String nomProduitActuel = getPage(BasePage.driver).getnomPrdtSelect();
			String nomProduitExpected = getPage(BasePage.driver).getNameProductInBonbonPage();
			Assert.assertEquals(nomProduitExpected, nomProduitActuel);
	    }

	    @And("^User denied the coockies$")
	    public void user_denied_the_coockies() throws Throwable {
	    	getPage(BasePage.driver).RefusCoockies();
	    }

	    @And("^select bonbon acidulé$")
	    public void select_bonbon_acidul() throws Throwable {
	    	getPage(BasePage.driver).ChooseProductInBonbonPage();
	    }

	    @And("^User can choose the product in \"([^\"]*)\" page$")
	    public void user_can_choose_the_product_in_something_page(String pagename) throws Throwable {
	    	page = pagename;
		    String expectedUrl = BasePage.PAGE_URLS.get(pagename);
			String actualUrl = BasePage.driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
	    }

	    @And("^user validat the quantity and name of bonbons$")
	    public void user_validat_the_quantity_and_name_of_bonbons() throws Throwable {
	    	getPage(BasePage.driver).CommandeBtn(BasePage.driver);
	    }
	    
}
