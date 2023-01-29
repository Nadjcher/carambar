package carambarCoPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BonbonPage extends BasePage {
	
	public static WebDriver driver;
	
	public BonbonPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath =  "//header/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[2]")
	WebElement bonbonLink;
	
	@FindBy(xpath =  "//a[contains(text(),'Bonbons acidulés')]")
	WebElement bonbonAciduleLink;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/*[1]")
	WebElement ChooseFirstProdctLeft;
	
	@FindBy(xpath = "//span[contains(text(),'Je refuse')]")
	WebElement refusCoockies;
	
	@FindBy(xpath = "//span[contains(text(),'Je commande !')]")
	WebElement JeCommandeBtn;
	
	@FindBy(xpath =  "//span[contains(text(),'Promotions')]")
	WebElement promotionsLink;
		
	
	//public void ChoseBonbonAcidulé(driver, bonbonLink, bonbonAciduleLink) {
		//Actions actions = new Actions(driver);
		//actions.moveToElement(bonbonLink).moveToElement(bonbonAciduleLink).click().perform();
	
	//}	
	
	
	public void CommandeBtn(WebDriver driver) {
		String newWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(newWindowHandle);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JeCommandeBtn.click();
	}
	
	public void ChooseProductInBonbonPage(WebDriver driver) {
		ChooseFirstProdctLeft.click();
	}
	
	public String  getNameProductInBonbonPage(WebDriver driver) {
		String NameProductInBonbonPage=ChooseFirstProdctLeft.getText();
		return NameProductInBonbonPage;
	}
	
	public void ClickPromotions() {
		promotionsLink.click();
	}
	@Override
	public void setConnection() {
	}

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
	public void loginConnexion(String email, String password) {
		
	}

	@Override
	public void clickConnecteToi() {
		
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
