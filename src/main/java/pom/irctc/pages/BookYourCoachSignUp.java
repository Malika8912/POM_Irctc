package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookYourCoachSignUp extends GenericWrappers{
	
	public BookYourCoachSignUp switchToWindow() {
		switchToLastWindow();
		return this;
	}
	
	public BookYourCoachSignUp waitAndHold() {
		waitproperty(5000);
		return this;
	}
	
	public BookYourCoach clickSignup() {
		clickByXpath("//a[text()='New User? Signup']");
		return new BookYourCoach();
	}


}