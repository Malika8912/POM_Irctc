package pom.sscregistration.pages;

import wrappers.GenericWrappers;

public class SscRegistration extends GenericWrappers{
	
	public SscRegistration clickYes(String clickAadhar) {
		clickByXpath("(//label[text()='"+clickAadhar+"']/preceding-sibling::input)[1]");
		return new SscRegistration();
	}
	
	public SscRegistration enterAadhaar(String aadhaar) {
		enterByXpath("//input[@id='AadharNumber']", aadhaar);
		return new SscRegistration();
	}
	
	public SscRegistration enterVerifyAadhaar(String verifyAadhaar) {
		enterByXpath("//input[@id='VerifyAadharNumber']", verifyAadhaar);
		return new SscRegistration();
	}
	
	public SscRegistration enterName(String name) {
		enterByXpath("//input[@id='Name']", name);
		return new SscRegistration();
	}
	
	public SscRegistration verifyName(String verifyName) {
		enterByXpath("//input[@id='VerifyName']", verifyName);
		return new SscRegistration();
	}

	public SscRegistration clickRadio(String Radio) {
		clickByXpath("(//label[text()='"+Radio+"']/preceding-sibling::input)[2]");
		return new SscRegistration();
	}
	
	public SscRegistration enterFatherName(String fatherName) {
		enterByXpath("//input[@id='FatherName']", fatherName);
		return new SscRegistration();
	}

	public SscRegistration verifyFatherName(String verifyFatherName) {
		enterByXpath("//input[@id='VerifyFatherName']", verifyFatherName);
		return new SscRegistration();
	}

	public SscRegistration enterMotherName(String motherName) {
		enterByXpath("//input[@id='MotherName']", motherName);
		return new SscRegistration();
	}

	public SscRegistration verifyMotherName(String verifymotherName) {
		enterByXpath("//input[@id='VerifyMotherName']", verifymotherName);
		return new SscRegistration();
	}
	
	public SscRegistration enterDob(String DOB) {
		enterByXpath("//input[@id='DateOfBirth']", DOB);
		return new SscRegistration();
	}
	
	public SscRegistration verifyDob(String verifyDOB) {
		enterByXpath("//input[@id='VerifyDateOfBirth']", verifyDOB);
		return new SscRegistration();
	}
	
	public SscRegistration selectMatriculation(String Board) {                      								
		SelectVisibileTextByXpath("//select[@id='EducationBoard']", Board);
		return new SscRegistration();
	}
	
	public SscRegistration verifyMatriculation(String verifyBoard) {
		SelectVisibileTextByXpath("//select[@id='ddlEducationBoard']", verifyBoard);
		return new SscRegistration();
	}
	
	public SscRegistration enterRollNo(String Rollno) {
		enterByXpath("//input[@id='SecondaryRollNum']", Rollno);
		return new SscRegistration();
	}
	
	public SscRegistration verifyRollno(String verifyRollno) {
		enterByXpath("//input[@id='VerifySecondaryRollNum']", verifyRollno);
		return new SscRegistration();
	}
	
	public SscRegistration selectYearOfPassing(String YoP) {
		SelectVisibileTextByXpath("//select[@id='Yearofpassing']", YoP);
		return new SscRegistration();
	}
	
	public SscRegistration verifyYearOfPassing(String verifyYoP) {
		SelectVisibileTextByXpath("//select[@id='ddlYearofpassing']", verifyYoP);
		return new SscRegistration();
	}
	
	public SscRegistration clickGender(String Gender) {
		clickByXpath("(//label[text()='"+Gender+"']/preceding-sibling::input)[1]");
		return new SscRegistration();
	}
	
	public SscRegistration verifyGender(String VerifyGender) {
		clickByXpath("(//label[text()='"+VerifyGender+"']/preceding-sibling::input)[2]");
		return new SscRegistration();
	}
	
	public SscRegistration selectGraduation(String Graduation) {
		SelectVisibileTextByXpath("//select[@id='Levelofeducationqualification']", Graduation);
		return new SscRegistration();
	}
	
	public SscRegistration enterMobielNo(String mobileNo) {
		enterByXpath("//input[@id='MobileNum']", mobileNo);
		return new SscRegistration();
	}
	
	public SscRegistration verifyMobileNo(String verifyMobileno) {
		enterByXpath("//input[@id='VerifyMobileNum']", verifyMobileno);
		return new SscRegistration();
	}
	public SscRegistration enterEmailId(String emailId) {
		enterByXpath("//input[@id='EmailID']", emailId);
		return new SscRegistration();
	}
	
	public SscRegistration verifyEmailid(String verifyEmailId) {
		enterByXpath("//input[@id='VerifyEmailID']", verifyEmailId);
		return new SscRegistration();
	}
	
	public SscRegistration selectState(String state) {
		SelectVisibileTextByXpath("//select[@id='OriginState']", state);
		return new SscRegistration();
	}

}
