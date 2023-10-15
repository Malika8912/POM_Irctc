package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC003";
		description = "To verify IRCTC Registration for new user";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC003";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void saloon(String name, String organisation, String address, String mobile, String email, String SaloonType, String originStation, 
			String destination, String DepartureYear, String CheckOutYear, String duration, String coachDetails, String passengersCount, String purpose, String Services, String verification){
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.mouseHoverOnLounge()
		.switchToWindow()
		.clickIcon()
		.clickCharter()
		.clickEnquiry()
		.enterName(name)
		.enterOrganisation(organisation)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmailId(email)
		.selectSaloon(SaloonType)
		.enterOriginStation(originStation)
		.enterDestination(destination)
		.clickDepartureDate()
		.selectDepartureYear(DepartureYear)
		.clickDepartureDay()
		.clickCheckOutDate()
		.selectCheckOutYear(CheckOutYear)
		.clickCheckOutDay()
		.enterDuration(duration)
		.enterCoachDetails(coachDetails)
		.enterPassengersCount(passengersCount)
		.enterPurpose(purpose)
		.enterServices(Services)
		.clickSubmit()
		.checkVerification(verification);
	}

}
