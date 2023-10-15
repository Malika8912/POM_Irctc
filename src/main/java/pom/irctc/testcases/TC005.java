package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC005";
		description = "To verify IRCTC Registration for new user";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC005";
	}
	
	@Test(dataProvider = "fetchData")
	public void gst(String emailId, String Mobileno, String hotelName,  String Year, String Month, String Day, String DestYear, String DestMonth, String Room, String Adult, String Title, String firstname, String Lastname, 
			String Country, String State, String GST, String CompanyName, String CompanyAddress, String VerifyGST){
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.mouseHoverOnLounge()
		.switchToWindow()
		.waitAndHold()
		.clickHotelIcon()
		.switchToWindow()
		.clickLogin()
		.clickUserLogin()
		.enterEmail(emailId)
		.enterMobileNo(Mobileno)
		.clickSubmit()
		.waitAndHold()
		.enterHotelName(hotelName)
		.waitAndHold()
		.clickCity()
		.checkInDate()
		.dropdownYear()
		.selectYear(Year)
		.selectMonth(Month)
		.selectDate(Day)
		.checkOutDate()
		.checkOutyear()
		.selectYearOut(DestYear)
		.selectMonthOut(DestMonth)
		.selectDateOut()
		.roomGuest()
		.selectRoom(Room)
		.selectAdult(Adult)
		.clickDone()
		.findHotel()
		.waitAndHold()
		.selectHotel()
		.switchToWindow()
		.waitAndHold()
		.Hotelname()
		.amount()
		.clickContinue()
		.waitAndHold()
		.selectTitle(Title)
		.enterFirstName(firstname)
		.enterLastName(Lastname)
		.selectCountry(Country)
		.selectState(State)
		//.enterMobileNo("8142212099")
		//.enterEmailId("malikabegum@gmail.com")
		.selectGST(GST)
		.enterCompanyName(CompanyName)
		.enterCompanyAddress(CompanyAddress)
		.clickSubmit1()
		.VerifyGST(VerifyGST);
		
	}
	

}
