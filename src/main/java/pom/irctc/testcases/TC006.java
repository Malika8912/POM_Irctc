package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FormCSignUp;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC006";
		description = "To verify IRCTC Registration for new user";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
	}
	
	@Test(dataProvider = "fetchData")
	public void formC(String userid, String password, String confPassword, String SecQue, String secAns, String name, String Gender, String dob, String designation, 
			String emailId, String mobile, String phone, String Nationality, String name0, String capacity, String Address, String state, String City, String AccomadationType, 
			String AccomadationGrade, String emailId0, String mobile1, String contact, String name2, String Address2, String State2, String City2, String emailId2, 
			String Phone2, String Mobile2, String name3, String Address3, String State3, String City3, String emailId3, String Phone3, String Mobile3, 
			String name4, String Address4, String State4, String City4, String emailId4, String Phone4, String Mobile4) {
		
		new FormCSignUp() 
		
		.clickSignup()
		.enterUserId(userid)
		.enterPassword(password)
		.enterConfPassword(confPassword)
		.waitAndHold()
		.selectSecQue(SecQue)
		.enterSecAns(secAns)
		.enterName(name)
		.selectGender(Gender)
		.enterDob(dob)
		.enterDesignation(designation)
		.enterEmailId(emailId)
		.enterMobile(mobile)
		.enterPhone(phone)
		.selectNationality(Nationality)
		.enterName1(name0)
		.enterCapacity(capacity)
		.enterAddress(Address)
		.selectState(state)
		.waitAndHold()
		.selectCity(City)
		.selectAccomadation(AccomadationType)
		.selectAccomadationGrade(AccomadationGrade)
		.enterEmailId1(emailId0)
		.enterMobile1(mobile1)
		.enterContact(contact)
		.enterName2(name2)
		.enterAddress2(Address2)
		.selectState2(State2)
		.waitAndHold()
		.selectCity2(City2)
		.enterEmailId2(emailId2)
		.enterPhone2(Phone2)
		.enterMobile2(Mobile2)
		.clickAdd()
		.enterName3(name3)
		.enterAddress3(Address3)
		.selectState3(State3)
		.waitAndHold()
		.selectCity3(City3)
		.enterEmailId3(emailId3)
		.enterPhone3(Phone3)
		.enterMobile3(Mobile3)
		.clickAdd()
		.enterName4(name4)
		.enterAddress4(Address4)
		.selectState4(State4)
		.waitAndHold()
		.selectCity4(City4)
		.enterEmailId4(emailId4)
		.enterPhone4(Phone4)
		.enterMobile4(Mobile4);
		
	}

}


