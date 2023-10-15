package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FormCSignUp extends GenericWrappers{

	public FormCRegistration clickSignup() {
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new FormCRegistration();
	}
	
}
