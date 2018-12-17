package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlAccountMappingLookupPage {
	private WebDriver driver;
	
	@FindBy(id="txtDebitGLAccountId")
	private WebElement DebitGLAccountId;
	
	@FindBy(id="txtCreditGLAccountId")
	private WebElement CreditGLAccountId;
	
	@FindBy(id="txtGlAccountMappingId")
	private WebElement GlAccountMappingId;
	
	@FindBy(id="ddlBenefitProgramId")
	private WebElement BenefitProgramId;
	
	@FindBy(xpath="//*[@id=\"tblCriteria\"]/tbody[1]/tr[5]/td[2]/img[1]")
	private WebElement startDate;
	
	@FindBy(xpath="//*[@id=\"tblCriteria\"]/tbody[1]/tr[5]/td[4]/img[1]")
	private WebElement endDate;
	
	@FindBy(xpath="//*[@id=\"tblCriteria\"]/tbody[1]/tr[4]/td[2]/div[1]/button[1]")
	private WebElement TransactionType;
	
	//Initialization
		public GlAccountMappingLookupPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//utilize
		public void clickDebitGLAccountId() {
			DebitGLAccountId.click();
		}
		public void clickCreditGLAccountId() {
			CreditGLAccountId.click();
		}
		public void clickstartDate() {
			startDate.click();
		}
		
}
