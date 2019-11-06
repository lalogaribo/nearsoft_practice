package selenium_driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.nearsoft.pages.BasePage;

public class BaseTest {
	
	protected WebDriver driver;
	protected ApplicationPages app;
	
	@BeforeSuite
	protected void setUp() {
		driver = BrowserDriver.createDriver(DriverType.FIREFOX);
		this.app = new ApplicationPages(driver);
		driver.manage().window().maximize();		
	}
	
	@BeforeTest
	protected void waitPageLoad() {
		BasePage.waitForLoad(driver);
	}

	@AfterSuite
	protected void tearDown() {
		BrowserDriver.quitDriver();
	}
	

}
