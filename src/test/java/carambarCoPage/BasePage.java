package carambarCoPage;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	public static String BASE_URL="https://www.laboutique.carambarco.com";
	 
	 public static Map<String ,String > PAGE_URLS = new HashMap<String, String>();
	 
	 static {

			PAGE_URLS.put("home", BASE_URL + "/");
			PAGE_URLS.put("Promotions", BASE_URL + "/80-promos");
			PAGE_URLS.put("Nouveautés", BASE_URL + "/22-nouveautes");
			PAGE_URLS.put("Marques", BASE_URL + "/marques");
			PAGE_URLS.put("bonbons", BASE_URL + "/10-bonbons");
			PAGE_URLS.put("chocolat", BASE_URL + "/13-chocolats");
			PAGE_URLS.put("evenement", BASE_URL + "/24-evenements");
			PAGE_URLS.put("connexion", BASE_URL + "/connexion?back=my-account");
			PAGE_URLS.put("mon-compte", BASE_URL + "/mon-compte");
			PAGE_URLS.put("login", BASE_URL + "/connexion");
			PAGE_URLS.put("loginBackMyAccount", BASE_URL + "/connexion?back=my-account");
			PAGE_URLS.put("bonbons-acidules", BASE_URL + "/26-bonbons-acidules");
			PAGE_URLS.put("panier", BASE_URL + "/panier?action=show");
			PAGE_URLS.put("commande", BASE_URL + "/commande");
			
	 } 
	 
	public static WebDriver driver;

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		}
    
	
	
	
	
	
	public abstract void setConnection();

	public abstract void creatNewClient(String firtname, String lastname, String email, String password);

	protected void creatNewClient() {}
	public  void RefusCoockies() {}

	public void setCreationCompte() {}

	public abstract void setEnregistrer();

	public abstract  String getNameCompte();

	public abstract void loginConnexion(String email, String password);

	public abstract void clickConnecteToi();

	public abstract String getNameCompteLoginPage();

	public void loginConnexion() {}

	public void clickrefuseLoginCoockies() {}

	public  void ChoseBonbonAcidulé(WebDriver driver) {
	}

	public  void ChooseFirstProdctLeft() {}

	public  void CommandeBtn(WebDriver driver) {}

	public  abstract String getnomPrdtSelect();

	public abstract void ChooseProductInBonbonPage();

	public abstract String getNameProductInBonbonPage();

	public  void accesPromotions() {};

	public  void clickajoutPanier() {};

	public  void linkProductPromotionPage() {};

	public abstract  String NameProductinPanier();

	public  void clicklinkProdctPromo() {}

	public  void setCodePromo(String codepromotion) {}

	public void ClickCommandBtn() {}

	public void setCodePromo() {}

	public  void clickLogo() {}

	public  abstract boolean loginBtnDisplay();



	
		
	}