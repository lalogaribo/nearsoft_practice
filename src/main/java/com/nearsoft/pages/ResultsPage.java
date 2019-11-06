package com.nearsoft.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ResultsPage extends BasePage {
	// Locators
	@FindBy(css = ".title-city-text")
	WebElement headerText;

	@FindBy(id = "sortDropdown")
	@CacheLookup
	WebElement sortDropdown;

	@FindBys({
			@FindBy(id = "flight-module-2020-02-06t07:55:00-06:00-coach-mex-gdl-y4-738-coach-gdl-cun-y4-606_2020-02-09t20:55:00-05:00-coach-cun-mex-4o-2391_") })
	private List<WebElement> flighResults;

	public ResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public ResultsPage waitForPageLoad() {
		wait.until(ExpectedConditions.visibilityOf(headerText));
		return this;
	}
	
	public ResultsPage sortByHigher() {
		Select list = new Select(sortDropdown);
		list.selectByValue("price:desc");
		return this;
	}
	
	public String getTypeOfSort() {
		wait.until(ExpectedConditions.elementSelectionStateToBe(sortDropdown, true));
		return sortDropdown.getText();
	}

}
