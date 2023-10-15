package pom.sscregistration.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.sscregistration.pages.SscRegistration;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC009";
		description = "To verify SSC Registration for new user";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://ssc.nic.in/registration/home";
		sheetName="TC009";
		
	}
	
	@Test(dataProvider="fetchData")
	public void sscRegistraion(String clickAadhar, String aadharno, String verifyaadharno, String name, String verifyname, String Radio, String fathername, String verifyfathername, 
			String mothername, String verifymothername, String dateofbirth, String verifyDOB, String educationboard, String verifyeducationboard, String hallticketno, 
			String verifyhallticketno, String yearofpassing, String verifyyearofpassing, String Gender, String VerifyGender, String qualification, String mobile, String verifymobile, 
			String email, String verifyemail, String state) {
		
		new SscRegistration()
		.clickYes(clickAadhar)
		.enterAadhaar(aadharno)
		.enterVerifyAadhaar(verifyaadharno)
		.enterName(name)
		.verifyName(verifyname)
		.clickRadio(Radio)
		.enterFatherName(fathername)
		.verifyFatherName(verifyfathername)
		.enterMotherName(mothername)
		.verifyMotherName(verifymothername)
		.enterDob(dateofbirth)
		.verifyDob(verifyDOB)
		.selectMatriculation(educationboard)
		.verifyMatriculation(verifyeducationboard)
		.enterRollNo(hallticketno)
		.verifyRollno(verifyhallticketno)
		.selectYearOfPassing(yearofpassing)
		.verifyYearOfPassing(verifyyearofpassing)
		.clickGender(Gender)
		.verifyGender(VerifyGender)
		.selectGraduation(qualification)
		.enterMobielNo(mobile)
		.verifyMobileNo(verifymobile)
		.enterEmailId(email)
		.verifyEmailid(verifyemail)
		.selectState(state);
	}

}
