package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravels;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
		
		@BeforeClass
		public void beforeClass() {
		testCaseName = "TC008";
		description = "To verify phptravels Registration for new user";
		author="Malika Begum";
		category="Functional";
		browserName="Chrome";
		url="https://www.phptravels.org/register.php";
		sheetName="TC008";
		}	
		
		@Test(dataProvider="fetchData")
		public void PhpTravel(String firstname, String lastname, String email, String phone, String address1, String address2, String address3, 
				String city, String state, String pincode, String country, String mobile, String password, String confirmpassword) {
			
		new PhpTravels()
		.enterName(firstname)
		.enterLastName(lastname)
		.enterEmailId(email)
		.clickCountryCode()
		.waitAndHold()
		.clickCode()
		.waitAndHold()
		.enterMobile(phone)
		.enterCompanyName(address1)
		.enterAddress1(address2)
		.enterAddress2(address3)
		.enterCity(city)
		.enterState(state)
		.enterPostCode(pincode)
		.selectCountry(country)
		.enterPhone(mobile)
		.enterPassword(password)
		.enterConfPassword(confirmpassword);
	}

}
