package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookHotel extends GenericWrappers{
	
	public BookHotel switchToWindow() {
		switchToLastWindow();
		return this;
	}
	
	public BookHotel waitAndHold() {
		waitproperty(5000);
		return this;
	}
	
	
	public BookHotel Hotelname() {
		getTextByXpath("//div[@class='mid-searchpack']");
		return this;
	}
	
	public BookHotel amount() {
		getTextByXpath("//strong[text()='₹ 2060 ']");
		return this;
	}
	
	public PersonalDetails clickContinue() {
		clickByXpath("//b[text()='Continue to Book']");
		return new PersonalDetails();
	}
	
}

