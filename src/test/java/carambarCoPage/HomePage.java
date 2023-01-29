package carambarCoPage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class HomePage extends BasePage {
	
	
	@FindBy(xpath =  "//body[1]/header[1]/div[2]/div[1]/div[2]/div[3]/a[1]/span[1]")
	WebElement connection;
	
	@FindBy(xpath =  "//span[contains(text(),'Promotions')]")
	WebElement promotionsLink;
	
	
	@FindBy(xpath = "//span[contains(text(),'Je refuse')]")
	WebElement refusCoockies;
	
	
	@FindBy(xpath  = "//span[contains(text(),'Mon panier')]")
	WebElement panier;
	
	@FindBy(xpath = "//header/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/input[2]")
	WebElement recherche;
	
	@FindBy(xpath = "//body[1]/header[1]/div[2]/div[1]/div[2]/div[3]/a[1]/span[1]")
	WebElement NameCompte;

	public static WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}
	
	public void setConnection() {
		connection.click();
	}
	
	public void accesPromotions() {
		promotionsLink.click();
	}	
	
	public void getPanier() {

		panier.click();

	}
	
	
	@Override
	protected void creatNewClient() {
	}

	@Override
	public void creatNewClient(String firtname, String lastname, String email, String password) {
		
	}

	@Override
	public void RefusCoockies() {
		refusCoockies.click();
	}

	@Override
	public void setEnregistrer() {
		
	}

	
	public String getNameCompte() {
		 String name=NameCompte.getText();
		 return name;
		
	}



	@Override
	public void clickConnecteToi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNameCompteLoginPage() {
		String name=NameCompte.getText();
		 return name;
	}

	@Override
	public void loginConnexion(String email, String password) {
		
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
