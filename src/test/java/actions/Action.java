package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public void click(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}
	
	public void twoElemclick(WebDriver driver, WebElement ele1, WebElement ele2) {

		Actions act = new Actions(driver);
		act.moveToElement(ele1).moveToElement(ele2).click().build().perform();
	}
}
