package carambarCoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CommandePage extends BasePage {
	

	WebDriver driver;
	public CommandePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath =  "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/span[2]/input[1]")
	WebElement prenomChamp;
	
	@FindBy(xpath =  "/body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/span[2]/input[1]")
	WebElement nomChamp;
	
	@FindBy(xpath =  "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/label[1]/span[2]/input[1]")
	WebElement adresseChamp;
	
	@FindBy(xpath =  "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/label[1]/span[2]/input[1]")
	WebElement codePostalChamp;
	
	@FindBy(xpath =  "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[8]/label[1]/span[2]/input[1]")
	WebElement villeChamps;
	
	@FindBy(xpath =  "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/label[1]/span[2]/select[1]")
	WebElement paysChamps;
	
	@FindBy(xpath =  "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/label[1]/span[2]/input[1]")
	WebElement telephoneChamps;
	
	@FindBy(xpath =  "//span[contains(text(),'Utiliser aussi cette adresse pour la facturation')]")
	WebElement AcceptationFacturation;
	

	@FindBy(xpath =  "//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]/span[1]")
	WebElement continuBtn1;
	
	@FindBy(xpath =  "//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/form[1]/div[2]/button[1]/span[1]")
	WebElement continuBtn2;
	
	@FindBy(xpath =  "//*[@id=\"checkout-addresses-step\"]/div[2]/div/form/div[3]/button/span")
	WebElement continuBtn3;
	
	@FindBy(xpath =  "//*[@id=\"invoice-address\"]/div/div[2]/button/span")
	WebElement continuBtn4;
	
	@FindBy(xpath =  " //span[contains(text(),'Annuler')]")
	WebElement continuBtn5;
	
	@FindBy(xpath =  "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/form[1]/div[1]/ul[1]/li[1]/label[1]")
	WebElement accepterLesConditions;
	
	
	@FindBy(xpath = "//span[contains(text(),'Je refuse')]")
	WebElement refuseLoginCoockies;

	
	@FindBy(xpath = "//span[contains(text(),'Je commande !')]")
	WebElement commandeBtn;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]/div[4]/div[2]/button")
	WebElement closeConditions;
	
	
	
	public  void setPrenomChamp (String prenom) {
		prenomChamp.sendKeys(prenom);
	}
	
	public  void setNomChamp (String nom) {
		nomChamp.sendKeys(nom);
	}
	
	public  void setAdresseChamp (String adresse) {
		adresseChamp.sendKeys(adresse);
	}
	
	public  void setCodePostalChamp (String codepostal) {
		codePostalChamp.sendKeys(codepostal);
	}
	
	public  void setVilleChamps (String ville) {
		villeChamps .sendKeys(ville);
	}
	
	public  void setPaysChamps (String pays) {
		Select select = new Select(paysChamps);
		select.selectByVisibleText(pays);
	}
	
	
	public  void setTelephoneChamps (String telephone) {
		telephoneChamps .sendKeys(telephone);
	}
	
	public  void setAcceptationFacturation () {
		 AcceptationFacturation.click();
	}
	
	public  void setContinuBtn1 () {
		continuBtn1.click();
	}
	
	public  void setContinuBtn2 () {
		continuBtn2.click();
	}
	public  void setContinuBtn3 () {
		continuBtn3.click();
	}
	public  void setContinuBtn4 () {
		continuBtn4.click();
	}
	
	public  void setContinuBtn5 () {
		continuBtn5.click();
	}
	
	public  void setCloseConditions () {
		closeConditions.click();
	}
	
		
	public  void setAccepterLesConditions () {
		//Actions act =  new Actions(driver);
		//act.moveToElement(AcceptationFacturation).click().perform();
		accepterLesConditions.click();
	}
	public  void setCommandeBtn () {
		commandeBtn.click();
	}
	
	
	public void Commande(String prenom, String nom, String adresse,String codepostal,String ville,String pays,String telephone) {
		
		this.setAdresseChamp(adresse);
		this.setCodePostalChamp(codepostal);
		this.setVilleChamps(ville);
		this.setPaysChamps (pays);
		this.setTelephoneChamps(telephone);
		this.setAcceptationFacturation();
		this.setContinuBtn1();
		this.setContinuBtn4();
		this.setContinuBtn5();
		this.setContinuBtn3 ();
		this.setContinuBtn2();
		
		this.setAccepterLesConditions();
		this.setCloseConditions();
		
		this.setCommandeBtn ();
		
		
	}
	
	
	
	
	

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
	public void loginConnexion(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickConnecteToi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean loginBtnDisplay() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
