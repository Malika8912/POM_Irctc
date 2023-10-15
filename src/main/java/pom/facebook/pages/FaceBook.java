package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBook extends GenericWrappers{
	
	public FaceBook enterName(String name) {
		enterByXpath(prop.getProperty("FaceBook.enterName.Xpath"), name);
		return new FaceBook();
	}
	
	public FaceBook enterLastName(String lastName) {
		enterByXpath(prop.getProperty("FaceBook.enterName.Xpath"), lastName);
		return new FaceBook();	
	}
	
	public FaceBook enterEmail(String emailId) {
		enterByXpath("//input[@name='reg_email__']", emailId);
		return new FaceBook();
	}
	
	public FaceBook enterConfEmailId(String ConfEmailId) {
		enterByXpath("//input[@name='reg_email_confirmation__']", ConfEmailId);
		return this;
	}
	
	public FaceBook enterPassword(String password) {
		enterByXpath("//input[@name='reg_passwd__']", password);
		return new FaceBook();
	}
	
	public FaceBook selectDay(String day) {
		SelectVisibileTextByXpath("//select[@id='day']", day);
		return new FaceBook();
	}
	public FaceBook selectMonth(String month) {
		SelectVisibileTextByXpath("//select[@id='month']", month);
		return new FaceBook();
	}
	public FaceBook selectYear(String year) {
		SelectVisibileTextByXpath("//select[@id='year']", year);
		return new FaceBook();
	}
	
	public FaceBook clickgender(String gender) {
		clickByXpath("//label[text()='"+gender+"']/following-sibling::input");
		return new FaceBook();
	}

}
