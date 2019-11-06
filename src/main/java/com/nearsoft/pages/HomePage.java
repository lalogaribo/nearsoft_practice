package com.nearsoft.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nearsoft.constants.Urls;

public class HomePage extends BasePage {
	
	//Locators
	@FindBy(id="tab-flight-tab-hp")
	@CacheLookup
	WebElement flightsTab;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public HomePage launch() {
		driver.get(Urls.URL);
		return this;
	}
	
	public void clickFlightTab() {
		flightsTab.click();
	}

}
