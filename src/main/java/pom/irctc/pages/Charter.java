package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Charter extends GenericWrappers{
	
	public Charter enterName(String name) {
		enterByXpath("//input[@name='name']", name);
		return new Charter();
	}
	
	public Charter enterOrganisation(String organisation) {
		enterByXpath("//input[@name='organization']", organisation);
		return new Charter();
	}
	
	public Charter enterAddress(String address) {
		enterByXpath("//input[@name='address']", address);
		return new Charter();
	}
	
	public Charter enterMobile(String mobile) {
		enterByXpath("//input[@name='mobile']", mobile);
		return new Charter();
	}
	
	public Charter enterEmailId(String emailId) {
		enterByXpath("//input[@name='email']", emailId);
		return new Charter();
	}
	
	public Charter selectSaloon(String SaloonType) {                                   
		SelectVisibileTextByXpath("//select[@name='requestFor']", SaloonType);
		return new Charter();
	}
	
	public Charter enterOriginStation(String originStation) {
		enterByXpath("//input[@name='originStation']", originStation);
		return new Charter();
	}
	
	public Charter enterDestination(String destination) {
		enterByXpath("//input[@name='destnStation']", destination);
		return new Charter();
	}
	
	public Charter clickDepartureDate() {
		clickByXpath("//input[@name='checkInDate']");
		return this;
	}
	
	public Charter selectDepartureYear(String DepartureYear) {
		SelectVisibileTextByXpath("(//select[@tabindex='-1'])[1]", DepartureYear);
		return this;
	}
	
	public Charter clickDepartureDay() {       						 
		clickByXpath("//span[text()='28']");
		return new Charter();
	}
	
	public Charter clickCheckOutDate() {
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}
	
	public Charter selectCheckOutYear(String CheckOutYear) {
		SelectVisibileTextByXpath("(//select[@tabindex='-1'])[2]", CheckOutYear);
		return this;
	}
	
	public Charter clickCheckOutDay() {      								 
		clickByXpath("(//span[text()='31'])[2]");
		return new Charter();
	}
	
	public Charter enterDuration(String duration) {
		enterByXpath("//input[@name='durationPeriod']", duration);
		return new Charter();
	}
	
	public Charter enterCoachDetails(String coachDetails) {
		enterByXpath("//input[@name='coachDetails']", coachDetails);
		return new Charter();
	}
	
	public Charter enterPassengersCount(String passengersCount) {
		enterByXpath("//input[@name='numPassenger']", passengersCount);
		return new Charter();
	}
	
	public Charter enterPurpose(String purpose) {
		enterByXpath("//textarea[@name='charterPurpose']", purpose);
		return new Charter();
	}
	
	public Charter enterServices(String Services) {
		enterByXpath("//textarea[@name='services']", Services);
		return new Charter();
	}
	
	public Charter clickSubmit() {      								
		clickByXpath("//button[@type='Submit']");
		return new Charter();
	}
	
	public Charter checkVerification(String verification) {
		verifyTextByXpath("//span[text()='Mobile no. not valid']", verification);
		return new Charter();
	}
	
}
