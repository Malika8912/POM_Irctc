package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public RegistrationPage clickOnRegister() {	
	 clickByXpath("//a[text()=' REGISTER ']");
	 return new RegistrationPage();
	}
	

	public HomePage mouseHoverOnHolidays() {
		mouseHover("//a[text()=' HOLIDAYS ']");
		return this;
	}
     
	public HomePage mouseHoverOnStays() {
		mouseHover("//span[text()='Stays']/..");
		return this;
	}
	
	public AccomodationPage mouseHoverOnLounge() {
		clickByXpath("//span[text()='Lounge']/..");
		return new AccomodationPage();
	}
	
	
	
}
