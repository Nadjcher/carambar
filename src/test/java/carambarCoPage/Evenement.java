package carambarCoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Evenement extends BasePage {

	public Evenement(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
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

	@Override
	public void clickajoutPanierDir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMessageAjoutPanier() {
		// TODO Auto-generated method stub
		return null;
	}

}
