package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookYourCoach extends GenericWrappers{
	
	public BookYourCoach waitAndHold() {
		waitproperty(5000);
		return this;
	}
	
	public BookYourCoach enterUserid(String userId) {
		enterByXpath("//input[@id='userId']", userId);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterPassword(String password) {
		enterByXpath("//input[@id='password']", password);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterCnfPassword(String cnfPassword) {
		enterByXpath("//input[@id='cnfPassword']", cnfPassword);
		return new BookYourCoach();
	}
	
	public BookYourCoach selectSecurityQues(String SequrityQue) {
		SelectVisibileTextByXpath("//select[@id='secQstn']", SequrityQue);
		return new BookYourCoach();
	}

	public BookYourCoach enterSecurityAns(String securityAns) {
		enterByXpath("//input[@id='secAnswer']", securityAns);
		return new BookYourCoach();
	}
	
	public BookYourCoach ClickDateOfBirth() {
		clickByXpath("//input[@id='dateOfBirth']");
		return new BookYourCoach();
	}
	
	public BookYourCoach selectYear(String Year) {
		SelectVisibileTextByXpath("//select[@aria-label='Select year']", Year);
		return this;
	}
	
	public BookYourCoach selectMonth(String Month) {
		SelectVisibileTextByXpath("//select[@aria-label='Select month']", Month);
		return this;
	}
	
	public BookYourCoach clickDay(String Day) {
		clickByXpath("//a[text()=" +Day);
		return this;
	}
	
	public BookYourCoach clickGender() {
		clickByXpath("//input[@id='gender1']");
		return new BookYourCoach();
	}
	
	public BookYourCoach clickMaritalStatus(String MaritalStatus) {
		clickByXpath("//label[text()='"+MaritalStatus+"']/preceding-sibling::input");
		return new BookYourCoach();
	}
	
	public BookYourCoach enterEmailId(String emailId) {
		enterByXpath("//input[@id='email']", emailId);
		return new BookYourCoach();
	}
	
	public BookYourCoach selectOccupation(String Occupation) {
		SelectVisibileTextByXpath("//select[@id='occupation']",Occupation );
		return new BookYourCoach();
	}
	
	public BookYourCoach enterFirstName(String firstName) {
		enterByXpath("//input[@id='fname']", firstName);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterMiddleName(String middleName) {
		enterByXpath("//input[@id='mname']", middleName);
		return new BookYourCoach();
	}

	public BookYourCoach enterLastName(String lastName) {
		enterByXpath("//input[@id='lname']", lastName);
		return new BookYourCoach();
	}
	
	public BookYourCoach selectNationality(String Nationality) {
		SelectVisibileTextByXpath("//select[@id='natinality']", Nationality);
		return this;
	}
	
	public BookYourCoach enterFlatNo(String flatNo) {
		enterByXpath("//input[@id='flatNo']", flatNo);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterStreet(String street) {
		enterByXpath("//input[@id='street']", street);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterArea(String area) {
		enterByXpath("//input[@id='area']", area);
		return new BookYourCoach();
	}
	
	public BookYourCoach selectCountry(String Country) {
		SelectVisibileTextByXpath("//select[@id='country']", Country);
		return this;
	}
	
	public BookYourCoach enterPhone(String phone) {
		enterByXpath("//input[@id='mobile']", phone);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterPincode(String pincode) {
		enterByXpath("//input[@id='pincode']", pincode);
		return new BookYourCoach();
	}
	
	public BookYourCoach selectPostOffice(String postOffice) {
		selectValueByXpath("//select[@id='postOffice']", postOffice);
		return new BookYourCoach();
	}
	
	public BookYourCoach clickAddress() {
		clickByXpath("//input[@id='sameAddresses1']");
		return new BookYourCoach();
	}
	
	public BookYourCoach enterOfcFlatNo(String ofcFlatNo) {
		enterByXpath("//input[@id='flatNoOffice']", ofcFlatNo);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterOfcStreet(String ofcStreet) {
		enterByXpath("//input[@id='streetOffice']", ofcStreet);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterOfcArea(String ofcArea) {
		enterByXpath("//input[@id='areaOffice']", ofcArea);
		return new BookYourCoach();
	}
	
	public BookYourCoach selectOffcCountry(String OffcCountry) {
		SelectVisibileTextByXpath("//select[@id='countryOffice']", OffcCountry);
		return this;
	}
	
	public BookYourCoach enterOfcPhone(String ofcPhone) {
		enterByXpath("//input[@id='mobileOffice']", ofcPhone);
		return new BookYourCoach();
	}
	
	public BookYourCoach enterOfcPincode(String ofcPincode) {
		enterByXpath("//input[@id='pincodeOffice']", ofcPincode);
		return new BookYourCoach();
	}
	
	public BookYourCoach selectOfcPostOffice(String OfcPostOffice) {
		selectValueByXpath("//select[@id='postOfficeOffice']", OfcPostOffice);
		return new BookYourCoach();
	}

}
