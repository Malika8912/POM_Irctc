package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC002";
		description = "To verify IRCTC Registration for new user";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC002";

	}
	
	@Test(dataProvider = "fetchData")
	public void bookCoach(String userid, String userpassword, String usercnfpassword, String sequrityques, String sequrityans, String month, String year,
			String Day, String MaritalStatus, String email, String occupation, String firstname, String middlename, String lastname, String nationality, 
			String address1, String address2, String address3, String country, String mobile, String pincode, 
			String postoffice, String ofcaddress1, String ofcaddress2, String ofcaddress3, String ofccountry, String phone, 
			String ofcpincode, String ofcpostoffice) {
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.mouseHoverOnLounge()
		.switchToWindow()
		.waitAndHold()
		.clickIcon()
		.clickCoach()
		.switchToWindow()
		.waitAndHold()
		.clickSignup()
		.waitAndHold()
		.enterUserid(userid)
		.enterPassword(userpassword)
		.enterCnfPassword(usercnfpassword)
		.selectSecurityQues(sequrityques)
		.enterSecurityAns(sequrityans)
		.ClickDateOfBirth()
		.selectYear(year)
		.selectMonth(month)
		.clickDay(Day)
		.clickGender()
		.clickMaritalStatus(MaritalStatus)
		.enterEmailId(email)
		.waitAndHold()
		.selectOccupation(occupation)
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.selectNationality(nationality)
		.enterFlatNo(address1)
		.enterStreet(address2)
		.enterArea(address3)
		.selectCountry(country)
		.enterPhone(mobile)
		.enterPincode(pincode)
		.waitAndHold()
		.selectPostOffice(postoffice)
		.clickAddress()
		.enterOfcFlatNo(ofcaddress1)
		.enterOfcStreet(ofcaddress2)
		.enterOfcArea(ofcaddress3)
		.selectOffcCountry(ofccountry)
		.enterOfcPhone(phone)
		.enterOfcPincode(ofcpincode)
		.waitAndHold()
		.selectOfcPostOffice(ofcpostoffice);
		
	}

}
