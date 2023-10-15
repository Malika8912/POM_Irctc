package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage waitAndHold() {
		waitproperty(5000);
		return this;
	}
		
	public RegistrationPage enterUserName(String userName) {
		enterByXpath("//input[@id='userName']", userName);
		return new RegistrationPage();
	}

	public RegistrationPage enterPassword(String password) {
		enterByXpath("//input[@id = 'usrPwd']", password);
		return new RegistrationPage();
	}

	
	public RegistrationPage enterConfirmPassword(String confPassword) {
		enterByXpath("//input[@id = 'cnfUsrPwd']", confPassword);
		return new RegistrationPage();
		
	}
	
	public RegistrationPage clickLanguage() {
		clickByXpath("//span[text()='Preferred Language']");
		return this;
	}
	
	public RegistrationPage selectLanguage(String language) {
		clickByXpath("//span[text()=" +language);
		return new RegistrationPage();
	}
		
	public RegistrationPage clickSequrityQues() {
		clickByXpath("//p-dropdown[@formcontrolname='secque']");
		return new RegistrationPage();
	}
	
	public RegistrationPage selectSecQue(String SecQue) {
		clickByXpath("//span[text()=" +SecQue);
		return this;
	}
	
	public RegistrationPage enterSequrityAns(String secAns) {
		enterByXpath("//input[@formcontrolname='secAns']", secAns);
		return new RegistrationPage();
	}
	
	public RegistrationPage clickOnContinue() {
		clickByXpath("//button[@label='Continue']");
		return new RegistrationPage();
	}
	
	public RegistrationPage enterFirstName(String firstName) {
		enterByXpath("//input[@id='firstName']", firstName);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterMiddleName(String middleName) {
		enterByXpath("//input[@id='middleName']", middleName);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterLastName(String lastName) {
		enterByXpath("//input[@id='lastname']", lastName);
		return new RegistrationPage();
	}
	
	public RegistrationPage clickOccupation() {
		clickByXpath("//span[text()='Select Occupation']");
		return new RegistrationPage();
	}
	
	public RegistrationPage selectOccupation(String Occupation) {
		clickByXpath("//span[text()=" + Occupation);
		return this;
	}
	public RegistrationPage clickDob() {
		clickByXpath("//input[@placeholder='Date Of Birth']");
		return this;
	}
	
	public RegistrationPage selectYear(String Year) {
		SelectVisibileTextByXpath("(//select[@tabindex='0'])[2]", Year);
		return this;
	}
	
	public RegistrationPage selectMonth(String Month) {
		SelectVisibileTextByXpath("(//select[@tabindex='0'])[1]", Month);
		return this;
	}
	
	public RegistrationPage clickDay() {                                    
		clickByXpath("(//a[@draggable='false'])[9]");
		return this;
	}

	public RegistrationPage martitalStatus(String MartitalStatus) {
		clickByXpath("//label[text()='"+MartitalStatus+"']/preceding-sibling::div");
		return this;
	}
	
	public RegistrationPage selectCountry(String Country) {
		SelectVisibileTextByXpath("//select[@formcontrolname='resCountry']", Country);              
		return new RegistrationPage();
	}
	
	public RegistrationPage clickGender(String Gender) {             
		clickByXpath("//span[text()=" +Gender);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterEmailID(String emailId) {
		enterByXpath("//input[@id='email']", emailId);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterMobile(String mobile) {
		enterByXpath("//input[@id='mobile']", mobile);
		return new RegistrationPage();
	}
	
	public RegistrationPage clickNationality(String nationnality) {
		SelectVisibileTextByXpath("//select[@formcontrolname='nationality']", nationnality);
		return this;
	}
	
	public RegistrationPage clickContinue() {
		clickByXpath("//button[@label='Continue']");
		return new RegistrationPage();
	}
	
	public RegistrationPage enterAddress1(String address1) {
		enterByXpath("//input[@id='resAddress1']", address1);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterAddress2(String address2) {
		enterByXpath("//input[@id='resAddress2']", address2);
		return new RegistrationPage();
	}
	
	
	public RegistrationPage enterAddress3(String address3) {
		enterByXpath("//input[@id='resAddress3']", address3);
		return new RegistrationPage();
	}
	
	
	public RegistrationPage enterPincode(String pincode) {
		enterByXpath("//input[@name='resPinCode']", pincode);
		return new RegistrationPage();
	}
	

	public RegistrationPage enterState(String state) {
		enterByXpath("//input[@id='resState']", state);
		return new RegistrationPage();
	}
	
	public RegistrationPage selectCity(String City) {
		SelectVisibileTextByXpath("//select[@formcontrolname='resCity']", City);
		return new RegistrationPage();
	}
	
	public RegistrationPage selectPostOffice(String PostOffice) {
		SelectVisibileTextByXpath("//select[@formcontrolname='resPostOff']", PostOffice);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterPhone(String phone) {
		enterByXpath("//input[@id='resPhone']", phone);
		return new RegistrationPage();
	}
	
	public RegistrationPage residence() {
		clickByXpath("//label[text()='No']");
		return this;
	}
	
	public RegistrationPage enterOfficeAddress(String OfficeAddress) {
		enterByXpath("//input[@id='offAddress1']", OfficeAddress);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterofficeStreet(String officeStreet) {
		enterByXpath("//input[@id='offAddress2']", officeStreet);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterofficeArea(String officeArea) {
		enterByXpath("//input[@id='offAddress3']", officeArea);
		return new RegistrationPage();
	}
	
	public RegistrationPage clickOfcCountry() {
		clickByXpath("//p-dropdown[@value='countryId']/div");
		return this;
	}
	
	public RegistrationPage selectofficeCountry() {
		clickByXpath("//li[@aria-label='India']");
		return new RegistrationPage();
	}
	
	public RegistrationPage enterofficePincode(String officePincode) {
		enterByXpath("//input[@id='offPinCode']", officePincode);
		return new RegistrationPage();
	}
	
	
	public RegistrationPage enterofficeState(String officeState) {
		enterByXpath("//input[@id='offState']", officeState);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterofficeCity(String OffcCity) {
		enterByXpath("//input[@id='offCity']", OffcCity);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterofficePostoffice(String officePostoffice) {
		enterByXpath("//input[@id='offPostOff']", officePostoffice);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterofficePhone(String officePhone) {
		enterByXpath("//input[@id='offPhone']", officePhone);
		return new RegistrationPage();
	}
	
}
