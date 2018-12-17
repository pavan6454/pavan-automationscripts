package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class Login extends BaseTest{

	@Test
	public void login() throws Exception {

	LoginPage lp = new LoginPage(driver);
	lp.enterUsername("gopinathn");
	lp.enterPassword("111");
	lp.clickLoginBTN();
	Thread.sleep(5000);

	}
		
}
