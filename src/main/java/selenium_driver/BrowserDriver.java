package selenium_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriver {
	
	 static WebDriver driver;
	 
	 public static WebDriver createDriver(DriverType browser) {
		 System.out.println("[Setting up " + browser + " driver]");
		 switch(browser) {
		 case CHROME:
			 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			 driver = new ChromeDriver();
			 break;
		 case FIREFOX:
			 System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			 driver = new FirefoxDriver();
			 break;
		 case IE:
			 System.setProperty("webdriver.ie.driver", "src/main/resources/msedgedriver.exe");
			 driver = new InternetExplorerDriver();
			 break;
		 default:
			 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			 driver = new ChromeDriver();
			 break;
		 }
		return driver;
	 }
	 
	 public static void quitDriver() {
		 System.out.println("Closing driver...");
		 driver.quit();
	 }
}
