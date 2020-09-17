package generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@Listeners(Result.class)
public abstract class BaseTest implements IAutoConst {
	public static WebDriver driver;
	public String url = Utility.getPropertyValue(CONFIG_PATH, "URL");
	String ITO=Utility.getPropertyValue(CONFIG_PATH, "ITO");
	public long duration =Long.parseLong(ITO);
	public static ExtentTest test;
	public static ExtentReports report;
	static {
		System.setProperty(CHROME_KEY,CHROME_VALUE );
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@Parameters({"ip","browser"})
	@BeforeTest
	public void openApplication(@Optional("localhost")String ip,@Optional("chrome")String browser){
		
		driver = Utility.openBrowser(driver,ip,browser);
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@BeforeClass
	public static void startTest()
	{
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	report = new ExtentReports("C:\\pavan-automationscripts\\HEB-jenkins\\Reports\\rep"+timeStamp.replace(":","_").replace(".","_")+".html");
	report.loadConfig(new File(System.getProperty("user.dir")+"\\configs\\extent-config.xml"));
	
	test = report.startTest("ExtentDemo");
	}
	
	
	@AfterMethod
	public void testResult(ITestResult result) {
		String name = result.getName();
		int status = result.getStatus();
		
		if (result.getStatus() == ITestResult.FAILURE) {
			String path = Utility.getPhoto(driver, PHOTO_PATH);
			Reporter.log("Test :"+name+" is Failed & Photo is: "+path,true);
		}else {
			Reporter.log("Test :"+name+" is Passed",true);
		}
	}
	
	
	@AfterClass
	public static void endTest() {
	report.endTest(test);
	report.flush();
	}
	
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}
	
}
