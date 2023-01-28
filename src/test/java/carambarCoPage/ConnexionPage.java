package carambarCoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConnexionPage extends BasePage {
	
	WebDriver driver;
	
	@FindBy(xpath =  "//a[contains(text(),'Pas de compte ? Créez-en un')]")
	WebElement creationCompte;
	
	@FindBy(xpath  = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")
	WebElement genre;
	
	@FindBy(name = "firstname")
	WebElement firtname;
	
	@FindBy(name = "lastname")
	WebElement lastname;
	
	@FindBy(xpath = "//span[contains(text(),'un particulier')]")
	WebElement situation;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[10]/label[1]/span[1]")
	WebElement checkBoxAcceptation;
	
	@FindBy(xpath = "//span[contains(text(),'Enregistrer')]")
	WebElement enregistrer;
    
	
	
	
	public ConnexionPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public  void setCreationCompte() {
		creationCompte.click();
	}


	public void setGenre() {
		genre.click();
	}



	public void setFirtname(String firtnam) {
		firtname.sendKeys(firtnam); 
	}


	public void setLastname(String lastnam) {
		lastname.sendKeys(lastnam);
	}



	public void setSituation() {
		situation.click();
	}


	public void setEmail(String mail) {
		email.sendKeys(mail);
	}


	public void setPassword(String passwrd) {
		password.sendKeys(passwrd);
	}


	public void setCheckBoxAcceptation() {
		checkBoxAcceptation.click();
	}


	public void setEnregistrer() {
		enregistrer.click();
	}
    
	
	
	public void creatNewClient(String firtname, String lastname, String email, String password) {

		this.setGenre();
		this.setFirtname(firtname);
		this.setLastname(lastname);
		this.setSituation();
		this.setEmail(email);
		this.setPassword(password);
		this.setCheckBoxAcceptation();
		//this.setEnregistrer();

	}


	@Override
	public void setConnection() {
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
