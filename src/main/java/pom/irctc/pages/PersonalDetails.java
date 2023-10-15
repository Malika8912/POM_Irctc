package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PersonalDetails extends GenericWrappers{
	
	public PersonalDetails waitAndHold() {
		waitproperty(5000);
		return this;
	}
	
	public PersonalDetails selectTitle(String Title) {
		SelectVisibileTextByXpath("//select[@name='title']", Title);
		return this;
	}
	
	public PersonalDetails enterFirstName(String firstname) {
		enterByXpath("//input[@name='firstName']", firstname);
		return this;
	}
	
	public PersonalDetails enterLastName(String Lastname) {
		enterByXpath("//input[@name='lastName']", Lastname);
		return this;
	}
	
	public PersonalDetails selectCountry(String Country) {
		SelectVisibileTextByXpath("//select[@name='country']", Country);
		return this;
	}
	
	public PersonalDetails selectState(String State) {
		SelectVisibileTextByXpath("//select[@name='state']", State);
		return this;
	}

	public PersonalDetails enterMobileNo(String MobileNo) {
		enterByXpath("(//input[@name='mobileNo'])[2]", MobileNo);
		return this;
	}
	
	public PersonalDetails enterEmailId(String EmailId) {
		enterByXpath("(//input[@name='email'])[2]", EmailId);
		return this;
	}
	
	public PersonalDetails selectGST(String GST) {
		SelectVisibileTextByXpath("//select[@name='gst']", GST);
		return this;
	}
	
	public PersonalDetails verifyHotelName(String HotelName) {
	verifyTextByXpath("//h5[text()='Oga Hotel Shriram @ Near MGR Central Railway Station ']", HotelName);
	return this;
	}
	
	public PersonalDetails verifyAmount(String amount) {
	verifyTextByXpath("//strong[text()='₹ 14896']", amount);
	return this;
	}
	
	public MakePayment clickSubmit() {
		clickByXpath("//button[text()='Continue']");
		return new MakePayment();
	}
		
	public PersonalDetails enterCompanyName(String CompanyName) {
		enterByXpath("//input[@name='companyName']", CompanyName);
		return this;
	}
	
	public PersonalDetails enterCompanyAddress(String CompanyAddress) {
		enterByXpath("//input[@name='companyAddress']", CompanyAddress);
		return this;
	}
	
	public PersonalDetails clickSubmit1() {
		clickByXpath("//button[text()='Continue']");
		return new PersonalDetails();
	}
	
	public PersonalDetails VerifyGST(String VerifyGST) {
		verifyTextByXpath("(//span[@class='ERR2'])[12]", VerifyGST);
		return this;
	}
	
}
