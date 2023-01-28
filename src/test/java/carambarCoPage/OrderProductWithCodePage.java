package carambarCoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderProductWithCodePage extends BasePage {

	public OrderProductWithCodePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
    
	
	@FindBy(xpath =  "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/input[3]")
	WebElement CodePromo;
	
	@FindBy(xpath =  "//span[contains(text(),'Je commande !')]")
	WebElement CommandBtn;
	
	
	public void setCodePromo(String codepromotion ) {
		CodePromo.sendKeys(codepromotion);
	}
	
	public void ClickCommandBtn() {
		CommandBtn.click();
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
	public void setCodePromo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean loginBtnDisplay() {
		// TODO Auto-generated method stub
		return false;
	}

}
