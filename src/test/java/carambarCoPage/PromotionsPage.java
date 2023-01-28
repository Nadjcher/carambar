package carambarCoPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromotionsPage extends BasePage {

	public PromotionsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy( xpath = "//body/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[3]/form[1]/button[1]/*[2]")
	WebElement linkProductPromotionPage;
	
	@FindBy( xpath = "//span[contains(text(),'Ajouter au panier')]")
	WebElement ajoutPanier;
	
	@FindBy(xpath = "//span[contains(text(),'Je commande !')]")
	WebElement JeCommandeBtn;
	
	@FindBy(xpath = "//strong[contains(text(),'Poulain Au Bon Lait & Bio')]")
	WebElement NomPrdctAjoute;
	
	

	public void clicklinkProdctPromo() {
		linkProductPromotionPage.click();
	}
	
	public void clickajoutPanier() {
		ajoutPanier.click();
	}
	
	public void CommandeBtn(WebDriver driver) {
		String newWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(newWindowHandle);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JeCommandeBtn.click();
	}
	
	public String  getNameProductInPromoPage(WebDriver driver) {
		String NameProductInBonbonPage=linkProductPromotionPage.getText();
		return NameProductInBonbonPage;
	}
    
	public String  NameProductinPanier(WebDriver driver) {
		String NameProductinPanier=NomPrdctAjoute.getAttribute("innerHTML");
		return NameProductinPanier;
	}

	@Override
	public void setConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creatNewClient(String firtname, String lastname, String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnregistrer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNameCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loginConnexion(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickConnecteToi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNameCompteLoginPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getnomPrdtSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ChooseProductInBonbonPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNameProductInBonbonPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String NameProductinPanier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loginBtnDisplay() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
