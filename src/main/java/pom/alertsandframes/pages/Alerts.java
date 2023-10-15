package pom.alertsandframes.pages;

import wrappers.GenericWrappers;

public class Alerts extends GenericWrappers{

	public Alerts getTheAlertText() {
		getAlertText();
		return this;
	}
	
	public HomePage acceptTheAlert() {	
		acceptAlert();
		return new HomePage();
	}
	
	
	public HomePage dismissTheAlert() {
		dismissAlert();
		return new HomePage();
	}
	
	public Alerts sendName(String Name) {
		sendMsg(Name);
		return this;
	}
	
}
