package objectrepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoObj {
	//private WebDriver driver;
	
	public DemoObj(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//*[@id=\"APjFqb\"]")
	private WebElement SearchBox;
	

	
	public void typeSearch(String searchtext) {
		SearchBox.click();
		SearchBox.sendKeys(searchtext);
		SearchBox.sendKeys(Keys.ENTER);
	}
	


}
