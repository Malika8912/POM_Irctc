package pom.alertsandframes.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alertsandframes.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC012";
		description = "Click on alert";
		author="Malika";
		category="Functional";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		
	}
	
	@Test
	public void promtAlerts() {
		
		new HomePage()
		.switchFrame()
		.waitandhold()
		.clickTryIt()
		.sendName("Malika")
		.getTheAlertText()
		.acceptTheAlert()
		.verifyText("Malika")
		.refreshPage()
		.switchFrame()
		.waitandhold()
		.clickTryIt()
		.sendName("Malika")
		.getTheAlertText()
		.dismissTheAlert()
		.verifyText("cancelled")
		.defaultTheContent()
		.clickHome();
		
	}

}
