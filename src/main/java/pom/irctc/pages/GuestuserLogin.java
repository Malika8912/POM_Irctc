package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestuserLogin extends GenericWrappers{
	
	public GuestuserLogin clickUserLogin() {
		clickByXpath("//a[@id='profile-tab']");
		return new GuestuserLogin();
	}
	
	public GuestuserLogin enterEmail(String emailId) {
		enterByXpath("//input[@name='email']", emailId);
		return new GuestuserLogin();
	}
	
	public GuestuserLogin enterMobileNo(String Mobileno) {
		enterByXpath("//input[@name='mobileNo']", Mobileno);
		return new GuestuserLogin();
	}
	
	public OtpValidation clickSubmit() {
		clickByXpath("(//button[@type='submit'])[2]");
		return new OtpValidation();
	}
	

}
