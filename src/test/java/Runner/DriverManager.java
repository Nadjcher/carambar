package Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	static WebDriver driver;
	
	//open driver
	public static WebDriver LaunchBrowser()  {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}
	//Close driver
	public static void CloseBrowser() {
		
		driver.close();
		driver.quit();
}




	
}
