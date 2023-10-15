package pom.alertsandframes.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alertsandframes.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC011";
		description = "Click on alert";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		
	}
	
	@Test
	public void confirmationAlert() {
		
		new HomePage()
		.switchFrame()
		.waitandhold()
		.clickTryIt()
		.getTheAlertText()
		.acceptTheAlert()
		.verifyText("OK!")
		.refreshPage()
		.switchFrame()
		.waitandhold()
		.clickTryIt()
		.getTheAlertText()
		.dismissTheAlert()
		.verifyText("Cancel!")
		.defaultTheContent()
		.clickHome();
		
		
	}

}
