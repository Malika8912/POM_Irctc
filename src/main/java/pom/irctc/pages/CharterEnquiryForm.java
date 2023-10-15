package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterEnquiryForm extends GenericWrappers{
	
	public Charter clickEnquiry() {
		clickByXpath("//a[@id='enquiry-tab']");
		return new Charter();
	}

}
