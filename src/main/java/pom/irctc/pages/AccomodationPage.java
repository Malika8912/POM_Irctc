package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers{
	
	public AccomodationPage switchToWindow() {
		switchToLastWindow();
		return this;
	}
	
	public AccomodationPage waitAndHold() {
		waitproperty(5000);
		return this;
	}
	
	public AccomodationPage clickIcon() {
		clickByXpath("//a[@id='sidebarCollapse']");
		return this;
	}

	public BookYourCoachSignUp clickCoach() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new BookYourCoachSignUp();
	}
	
	
	public CharterEnquiryForm clickCharter() {
		clickByXpath("//a[text()='Charter']");
		return new CharterEnquiryForm();
	}
	
	public HotelLogin clickHotelIcon() {
		clickByXpath("(//div[@class='Nav-icons IRCTCHotels'])[1]");
		return new HotelLogin();
	}

}
