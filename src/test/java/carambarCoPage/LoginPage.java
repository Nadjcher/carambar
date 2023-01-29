package carambarCoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath =  "//body/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/label[1]/span[2]/input[1]")
	WebElement emailChamp;
	
	@FindBy(xpath =  "//body/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/label[1]/span[2]/input[1]")
	WebElement passWordChamp;
	
	@FindBy(xpath =  "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]/span[1]")
	WebElement connecteToi;
	
	@FindBy(xpath =  "//header/div[2]/div[1]/div[2]/a[1]/img[1]")
	WebElement imageClick;

	
	@FindBy(xpath = "//span[contains(text(),'Je refuse')]")
	WebElement refuseLoginCoockies;
	
	public  void setEmailChamp (String mail) {
		emailChamp.sendKeys(mail);
	}
	
	public  void setPassWordChamp(String wrdpass) {
		passWordChamp.sendKeys(wrdpass);
	}
	
	public  void clickConnecteToi() {
		connecteToi.click();
	}
	
	public  void clickLogo() {
		imageClick.click();
	}
	
	public  void clickrefuseLoginCoockies() {
		refuseLoginCoockies.click();
	}
	
	public  void loginConnexion (String email, String password) {
		this.setEmailChamp(email);
		this.setPassWordChamp(password);
	}
	
	public boolean loginBtnDisplay () {
		boolean displayBtn =connecteToi.isDisplayed();
		return displayBtn ;
	}
	
	
	
	
	
	//public String getNameCompteLoginPage() {
		 //String name=NameCompteLoginPage.getText();
		 //return name;
		
	//}

	@Override
	public void setConnection() {}

	@Override
	public void creatNewClient(String firtname, String lastname, String email, String password) {
		
	}

	@Override
	public void setEnregistrer() {
		
	}

	@Override
	public String getNameCompte() {
		return null;
	}

	@Override
	public String getNameCompteLoginPage() {
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
	public void setCodePromo(String codepromotion) {
		// TODO Auto-generated method stub
		
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
