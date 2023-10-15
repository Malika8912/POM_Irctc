package pom.alertsandframes.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alertsandframes.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC010";
		description = "Click on alert";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		
	}
	
	@Test
	public void simpleAlert() {
		
		new HomePage()
		.switchFrame()
		.waitandhold()
		.clickTryIt()
		.getTheAlertText()
		.acceptTheAlert()
		.defaultTheContent()
		.clickHome();
		
	}

}
