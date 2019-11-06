package selenium_driver;

import org.openqa.selenium.WebDriver;

import com.nearsoft.pages.FlightsPage;
import com.nearsoft.pages.HomePage;
import com.nearsoft.pages.ResultsPage;

public class ApplicationPages{
	private HomePage homePage;
	private FlightsPage flightPage;
	private ResultsPage resultPage;
	
	public ApplicationPages(WebDriver driver) {
		this.homePage = new HomePage(driver);
		this.flightPage = new FlightsPage(driver);
		this.resultPage = new ResultsPage(driver);
	}

	public HomePage useHome() {
		return this.homePage;
	}
	
	public FlightsPage useFligh() {
		return this.flightPage;
	}
	
	public ResultsPage useResults() {
		return this.resultPage;
	}
}
