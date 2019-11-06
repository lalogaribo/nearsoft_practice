package com.nearsoft.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage extends BasePage{
	
	//Locators
	@FindBy(id="flight-origin-hp-flight")
	@CacheLookup
	WebElement flyingFrom;
	
	@FindBy(id="flight-destination-hp-flight")
	@CacheLookup
	WebElement flyingTo;
	
	@FindBy(id="flight-departing-hp-flight")
//	@CacheLookup
	WebElement departingDate;
	
	@FindBy(id="flight-returning-hp-flight")
	@CacheLookup
	WebElement returninDate;

	@FindBy(id="traveler-selector-hp-flight")
	WebElement travelerDropDown;

	@FindBy(xpath="//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button")
	@CacheLookup
	WebElement travelSelectorField;
	
	@FindBy(css="div.children-wrapper button.uitk-step-input-button.uitk-step-input-plus")
	@CacheLookup
	WebElement childrenButton;
	
	@FindBy(id="flight-age-select-1-hp-flight")
	@CacheLookup
	WebElement ageDropdown;
	
	@FindBy(id="flight-origin-hp-flight")
	@CacheLookup
	WebElement selectionOutput;
	
	@FindBy(css="button.btn-primary.btn-action.gcw-submit")
	WebElement submitButton;
	
	public FlightsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public FlightsPage setDepartureCity(String cityFrom) {
		wait.until(ExpectedConditions.elementToBeClickable(flyingFrom)).sendKeys(cityFrom);
		return this;
	}
	
	public FlightsPage setDestinyCity(String cityTo) {
		wait.until(ExpectedConditions.elementToBeClickable(flyingTo)).sendKeys(cityTo);
		return this;
	}
	
	public FlightsPage setDepartingDate(String date) {
		wait.until(ExpectedConditions.elementToBeClickable(departingDate)).sendKeys(date);
		return this;
	}
	
	public FlightsPage setReturningDate(String returningDate) {
		wait.until(ExpectedConditions.elementToBeClickable(returninDate)).sendKeys(returningDate);
		return this;
	}
	
	public FlightsPage clickTravelersOption() {
		travelerDropDown.click();
		return this;
	}
	
	public FlightsPage setChildren() {
		wait.until(ExpectedConditions.visibilityOf(childrenButton));
		childrenButton.click();
		return this;
	}
	
	public FlightsPage setChildrenAge() {
		Select list = new Select(ageDropdown);
		list.selectByValue("5");
		return this;
	}
	
	public void submitSearch() {
		submitButton.click();
	}
	

}
