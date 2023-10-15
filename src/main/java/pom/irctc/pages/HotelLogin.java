package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelLogin extends GenericWrappers{
	
	public HotelLogin switchToWindow() {
		switchToLastWindow();
		return this;
	}
	
	
	public GuestuserLogin clickLogin() {
		clickByXpath("//a[text()='Login']");
		return new GuestuserLogin();
	}

}
