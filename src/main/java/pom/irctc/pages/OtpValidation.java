package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpValidation extends GenericWrappers{
	
	public OtpValidation waitAndHold() {
		waitproperty(5000);
		return this;
	}
	
	public OtpValidation enterHotelName(String hotelName) {
		enterByXpath("//input[@id='filterText']", hotelName);
		return new OtpValidation();
	}
	
	public OtpValidation clickCity() {
		clickByXpath("//div[@class='left_city']");
		return new OtpValidation();
	}
	
	public OtpValidation checkInDate() {
		clickByXpath("//input[@name='dt12']");
		return this;
	}
	
	public OtpValidation dropdownYear() {
		clickByXpath("(//span[@tabindex='-1'])[2]");
		return this;
	}
	
	public OtpValidation selectYear(String Year) {
		clickByXpath("//span[text()=" +Year);
		return this;
	}
	
	public OtpValidation selectMonth(String Month) {
		clickByXpath("//span[text()=" +Month);
		return this;
	}
	
	
	public OtpValidation selectDate(String Day) {
		clickByXpath("//span[text()=" +Day);
		return this;
	}
	
	public OtpValidation checkOutDate() {
		clickByXpath("//input[@placeholder='Check-out Date']");
		return this;
	}
	
	public OtpValidation checkOutyear() {
		clickByXpath("(//span[@tabindex='-1'])[2]");
		return this;
	}

	public OtpValidation selectYearOut(String DestYear) {
		clickByXpath("//span[text()=" +DestYear);
		return this;
	}
	
	public OtpValidation selectMonthOut(String DestMonth) {
		clickByXpath("//span[text()=" +DestMonth);
		return this;
	}
	
	public OtpValidation selectDateOut() {
		clickByXpath("(//span[text()='29'])[2]");
		return this;
	}
	
	public OtpValidation roomGuest() {
		clickByXpath("//input[@name='guest']");
		return this;
	}
	
	public OtpValidation selectRoom(String Room) {
		SelectVisibileTextByXpath("//select[@name='hotelRoom']", Room);
		return this;
	}
	
	public OtpValidation selectAdult(String Adult) {
		SelectVisibileTextByXpath("//select[@name='hotelAdult']", Adult);
		return this;
	}
	
	public OtpValidation clickDone() {
		clickByXpath("//a[text()='Done']");
		return this;
	}
	
	public SelectHotel findHotel() {
		clickByXpath("//input[@value='Search Hotel']");
		return new SelectHotel();
	}
	
	
}

