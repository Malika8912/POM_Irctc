package pom.irctc.pages;

import wrappers.GenericWrappers;

public class verify extends GenericWrappers{
	
	public verify clickVerify() {
		clickByXpath("(//button[@type='button'])[5]");
		return this;
	}
	
	public verify checkAlert(String alert) {
		verifyTextByXpath("//span[text()='otp is required.']", alert);
		return this;
	}
	

}
