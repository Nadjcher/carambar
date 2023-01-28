package carambarStepDefinition;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Runner.DriverManager;
import carambarCoPage.BasePage;
import carambarCoPage.BonbonPage;
import carambarCoPage.Chocolat;
import carambarCoPage.ConnexionPage;
import carambarCoPage.Evenement;
import carambarCoPage.HomePage;
import carambarCoPage.LoginPage;
import carambarCoPage.Marques;
import carambarCoPage.Nouveautés;
import carambarCoPage.PromotionsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;




public class BaseStepDefinition {
           
	
	
		protected static WebDriver driver;
		

		//@Before

		public void init() {

			BasePage.driver = DriverManager.LaunchBrowser();
			
		}
		

		protected WebDriver GetDriver() {
			if (driver == null) {
				driver = Runner.DriverManager.LaunchBrowser();
			}
			return driver;
		}
	
		public String page;

		public BasePage getPage(WebDriver driver) {
			
			switch (page) {
			case "home":
				return new HomePage(driver) ;

			case "Promotions":
				return new PromotionsPage(driver);
				
			case "Nouveautés":
				return new Nouveautés(driver);	
			
			case "marques":
				return new Marques(driver);
				
			case "bonbons":
				return new BonbonPage(driver);
				
			case "chocolat":
				return new Chocolat(driver);
				
			case "evenement":
				return new Evenement(driver);	
				
			case "connexion":
				return new ConnexionPage(driver);	
			case "login":
				return new LoginPage(driver);
				
			}
			return null;
		}
		
		 public static void assertUrl(String pagename) {
    
		    	String expectedUrl = BasePage.PAGE_URLS.get(pagename);
		    	String actualUrl = BasePage.driver.getCurrentUrl();
		    	Assert.assertEquals(expectedUrl, actualUrl);
             
     }   
}


