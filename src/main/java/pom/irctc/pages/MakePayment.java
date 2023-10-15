package pom.irctc.pages;

import wrappers.GenericWrappers;

public class MakePayment extends GenericWrappers{
	
	public MakePayment clickAgree() {
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public verify clickMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return new verify();
	}
	

}
