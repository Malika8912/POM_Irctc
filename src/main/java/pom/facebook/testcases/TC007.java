package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookSignUp;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	@BeforeClass
public void beforeClass() {
		testCaseName ="TC007";
		description = "To verify facebook signup for the new user";
		author="Malika Begum";
		category="Smoke";
	 browserName="Chrome";
	 url="https://www.facebook.com";
	 sheetName="TC007";
		
	}
	@Test
	public void faceBookRegistration() {
		
		new FacebookSignUp()
		.clickNewAccount()
		.enterName("Malika Begum")
		.enterLastName("Shaik")
		.enterEmail("shaikkmallika@gmail.com")
		.enterConfEmailId("shaikkmallika@gmail.com")
		.enterPassword("bdanskmxas")
		.selectDay("12")
		.selectMonth("Nov")
		.selectYear("1998")
		.clickgender("Female");
		
	}

}
