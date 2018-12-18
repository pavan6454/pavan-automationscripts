package script;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.GlAccountMappingLookupPage;

public class GlAccountMappingLookup extends BaseTest{
	
//	@Test
//	public void menubar() throws Exception {
//		String id="btnHeaderToggleMenuDivCollapseExpand";
//		driver.findElement(By.id(id)).click();
//		
//	}
	@Test
	public void glAccountMap() {
		
		String link="Finance";
		driver.findElement(By.linkText("Finance")).click();
		String l2="GL";
		driver.findElement(By.linkText("GL")).click();
		String l3="GL Account Mapping";
		driver.findElement(By.linkText("GL Account Mapping")).click();
	GlAccountMappingLookupPage gl= new GlAccountMappingLookupPage(driver);
	gl.clickCreditGLAccountId();
	gl.clickDebitGLAccountId();
	gl.clickstartDate();
	}
}
