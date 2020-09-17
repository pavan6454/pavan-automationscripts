package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	private WebDriver driver;
	
	@FindBy(linkText="About Us")
	public WebElement AboutUsLink;

	@FindBy(xpath="//i[@class='fa fa-envelope']/..//li//p")
	private WebElement email;
	
//	@FindBy(id="Submit1")
//	private WebElement login;
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void selectLink() {
		AboutUsLink.click();
		
	}
	
	public String getText() {
		String Email = email.getText();
		return Email;
	}
	
	
}
