package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class Home extends BaseTest{

	@Test
	public void Home() throws Exception {
	HomePage hp = new HomePage(driver);
	WebDriverWait wait=new WebDriverWait(driver, 20);
	hp.selectLink();
	Thread.sleep(5000);
	String val = hp.getText();
	
	if(val.equals("contact.phs@paramounttpa")) {
		test.log(LogStatus.PASS, "Email verified");
	}
	else
	{
	test.log(LogStatus.FAIL, "Test Failed");
	}
	
	String currentURL = driver.getCurrentUrl();
	Assert.assertEquals(currentURL, "NoTitle");
	}	
}
