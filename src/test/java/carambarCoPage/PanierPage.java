package carambarCoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PanierPage extends BasePage {

	public PanierPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//strong[contains(text(),'Lutti Pokemon Fizz')]")
	WebElement nomPrdtSelect;
	
	@FindBy(xpath = "//div[contains(text(),'1 article')]")
	WebElement nbrPrdtSelect;
	
	@FindBy(name = "discount_name")
	WebElement CodePromo;
	
	@FindBy(xpath =  "//span[contains(text(),'Je commande !')]")
	WebElement CommandBtn;
	
	@FindBy(xpath =  "//h2[contains(text(),'Erreur')]")
	WebElement messageAjoutCode;
	
	@FindBy(xpath =  "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/button[1]/*[1]")
	WebElement btnPlusPromo;

	
	public String getnbrPrdtSelect() {
		String nbrArticle = nbrPrdtSelect.getText();
		return nbrArticle;
	}
	
	public String getnomPrdtSelect() {
		String nomArticle = nomPrdtSelect.getText();
		return nomArticle;
	}
	
	public void setCodePromo(String codepromotion ) {
		CodePromo.sendKeys(codepromotion);
		btnPlusPromo.click();
	}
	
	public void ClickCommandBtn() {
		CommandBtn.click();
	}
	
	public String MessageAjoutCode() {
		String AjoutCodeMessage =messageAjoutCode.getText();
		return AjoutCodeMessage;
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
