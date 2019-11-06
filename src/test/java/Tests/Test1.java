package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.nearsoft.constants.Constants;
import selenium_driver.BaseTest;

public class Test1 extends BaseTest {

	@Test
	public void generateFly() {
		app.useHome().launch().clickFlightTab();
		app.useFligh()
		.setDepartureCity(Constants.departureCity)
		.setDestinyCity(Constants.destinyCity)
		.setDepartingDate(Constants.departingDate)
		.setReturningDate()
		.clickTravelersOption()
		.setChildren()
		.setChildrenAge()
		.submitSearch();
	}
	
	@Test
	public void sortByHigher()  {
		app.useResults()
		.sortByHigher();
		app.useResults().getFlighResults();
//		Assert.assertEquals(app.useResults().getTypeOfSort(), "Price (Highest)");
	}

}
