package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.testng.Assert;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		
		this.driver = driver;
	}

	// Element Library

	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOARD_ELEMENT_FIELD;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text (), 'Dashboard')]")
	WebElement Dashboard_Locator;
	
	
	//Methods to interact with the elements
	
	
	public void verifyDashBoardElement() {
		//Assert.assertEquals(DASHBOARD_ELEMENT_FIELD.getText(), "Dashboard", "Wrong Page");
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
