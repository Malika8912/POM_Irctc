package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;

import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC001";
		description = "To verify IRCTC Registration for new user";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void irctcRegistration(String username, String password, String confpassword,String language, String SecQue, String secAns, String firstname, String middlename, String lastname, String Occupation, 
			String month, String year, String MartitalStatus, String country, String Gender, String email, String mobile, String country1, String Address1, String Address2, 
			String Address3, String pincode, String City, String PostOffice, String phone, String ofcAddress1,
			String ofcAddress2, String ofcAddress3, String ofcpincode, String ofcstate, String ofccity, String ofcpostofc, String ofcphone) {
		new HomePage()
		.clickOnRegister()
		.waitAndHold()
		.enterUserName(username)
		.enterPassword(password)
		.enterConfirmPassword(confpassword)
		.clickLanguage()
		.waitAndHold()
		.selectLanguage(language)
		.clickSequrityQues()
		.selectSecQue(SecQue)
		.enterSequrityAns(secAns)
		.clickOnContinue()
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.clickOccupation()
		.waitAndHold()
		.selectOccupation(Occupation)
		.clickDob()
		.selectYear(year)
		.selectMonth(month)
		.clickDay()
		.martitalStatus(MartitalStatus)
		.selectCountry(country)
		.clickGender(Gender)
		.enterEmailID(email)
		.enterMobile(mobile)	
		.clickNationality(country1)
		.clickContinue()
		.enterAddress1(Address1)
		.enterAddress2(Address2)
		.enterAddress3(Address3)
		.enterPincode(pincode)
		//.enterState("Telangana")
		.selectCity(City)
		.selectPostOffice(PostOffice)
		.enterPhone(phone)
		.residence()
		.enterOfficeAddress(ofcAddress1)
		.enterofficeStreet(ofcAddress2)
		.enterofficeArea(ofcAddress3)
		.waitAndHold()
		.clickOfcCountry()
        .selectofficeCountry()
		.enterofficePincode(ofcpincode)
		.enterofficeState(ofcstate)
		.enterofficeCity(ofccity)
		.enterofficePostoffice(ofcpostofc)
		.enterofficePhone(ofcphone);

	}

}
