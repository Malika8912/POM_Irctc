package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SelectHotel extends GenericWrappers{
	
	public SelectHotel waitAndHold() {
		waitproperty(10000);
		return this;
	}

	public BookHotel selectHotel() {
		clickByXpath("(//div[@class='mid-searchpack']/..)[1]");
		return new BookHotel();
	}
	
	
}
