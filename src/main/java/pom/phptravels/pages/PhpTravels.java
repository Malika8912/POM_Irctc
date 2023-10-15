package pom.phptravels.pages;

import pom.irctc.pages.RegistrationPage;
import wrappers.GenericWrappers;

public class PhpTravels extends GenericWrappers{
	
	public PhpTravels enterName(String name) {
		enterByXpath("//input[@id='inputFirstName']", name);
		return new PhpTravels();
	}
	
	public PhpTravels enterLastName(String lastName) {
		enterByXpath("//input[@id='inputLastName']", lastName);
		return new PhpTravels();
	}
	
	public PhpTravels enterEmailId(String emailId) {
		enterByXpath("//input[@id='inputEmail']", emailId);
		return new PhpTravels();
	}
	
	public PhpTravels clickCountryCode() {
		clickByXpath("//div[@class='iti-arrow']");
		return this;
	}
	
	public PhpTravels waitAndHold() {
		waitproperty(5000);
		return this;
	}
	
	public PhpTravels clickCode() {
		clickByXpath("//li[@data-dial-code='91']");
		return new PhpTravels();
	}
	
	public PhpTravels enterMobile(String mobile) {
		enterByXpath("//input[@id='inputPhone']", mobile);
		return new PhpTravels();
	}
	
	public PhpTravels enterCompanyName(String companyName) {
		enterByXpath("//input[@id='inputCompanyName']", companyName);
		return new PhpTravels();
	}
	
	public PhpTravels enterAddress1(String address1) {
		enterByXpath("//input[@id='inputAddress1']", address1);
		return new PhpTravels();
	}
	
	public PhpTravels enterAddress2(String address2) {
		enterByXpath("//input[@id='inputAddress2']", address2);
		return new PhpTravels();
	}
	
	public PhpTravels enterCity(String city) {
		enterByXpath("//input[@id='inputCity']", city);
		return new PhpTravels();
	}
	
	public PhpTravels enterState(String state) {
		enterByXpath("//input[@id='stateinput']", state);
		return new PhpTravels();
	}
	
	public PhpTravels enterPostCode(String postCode) {
		enterByXpath("//input[@id='inputPostcode']", postCode);
		return new PhpTravels();
	}
	
	public PhpTravels selectCountry(String country) {
		SelectVisibileTextByXpath("//select[@id='inputCountry']", country);
		return new PhpTravels();
	}
	
	public PhpTravels enterPhone(String phone) {
		enterByXpath("//input[@id='customfield2']", phone);
		return new PhpTravels();
	}
	
	public PhpTravels enterPassword(String password) {
		enterByXpath("//input[@id='inputNewPassword1']", password);
		return new PhpTravels();
	}
	
	public PhpTravels enterConfPassword(String confPassword) {
		enterByXpath("//input[@id='inputNewPassword2']", confPassword);
		return new PhpTravels();
	}

}
