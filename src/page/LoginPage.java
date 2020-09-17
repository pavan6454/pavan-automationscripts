package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	private WebDriver driver;
	
	@FindBy(id="UserName")
	private WebElement userName;

	@FindBy(name="Password")
	private WebElement passWord;
	
	@FindBy(id="Submit1")
	private WebElement login;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUsername(String name) {
		userName.sendKeys(name);
		
	}
	
	public void enterPassword(String username) {
		passWord.sendKeys(username);
	}
	
	public void clickLoginBTN() {
		login.click();
	}
}
