package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FormCRegistration extends GenericWrappers{
	
	public FormCRegistration enterUserId(String userid) {
		enterByXpath("//input[@id='u_id']", userid);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterPassword(String password) {
		enterByXpath("//input[@id='u_pwd']", password);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterConfPassword(String confPassword) {
		enterByXpath("//input[@id='u_repwd']", confPassword);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectSecQue(String SecQue) {
		SelectVisibileTextByXpath("//select[@id='u_secques']", SecQue);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterSecAns(String secAns) {
		enterByXpath("//input[@id='u_secans']", secAns);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterName(String name) {
		enterByXpath("//input[@id='u_name']", name);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectGender(String Gender) {
		SelectVisibileTextByXpath("//select[@name='u_gender']", Gender);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterDob(String dob) {
		enterByXpath("//input[@id='u_dob']", dob);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterDesignation(String designation) {
		enterByXpath("//input[@id='u_designation']", designation);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterEmailId(String emailId) {
		enterByXpath("//input[@id='u_emailid']", emailId);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterMobile(String mobile) {
		enterByXpath("//input[@id='u_mobile']", mobile);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterPhone(String phone) {
		enterByXpath("//input[@id='u_phone']", phone);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectNationality(String Nationality) {
		SelectVisibileTextByXpath("//select[@name='u_nationality']", Nationality);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterName1(String name0) {
		enterByXpath("//input[@id='name']", name0);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterCapacity(String capacity) {
		enterByXpath("//input[@id='capacity']", capacity);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterAddress(String Address) {
		enterByXpath("//textarea[@id='address']", Address);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectState(String state) {									
		SelectVisibileTextByXpath("//select[@name='state']", state);
		return new FormCRegistration();
	}
	
	public FormCRegistration waitAndHold() {
		waitproperty(5000);
		return this;
	}
	
	public FormCRegistration selectCity(String City) {									 
		SelectVisibileTextByXpath("//select[@name='city_distr']", City);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectAccomadation(String AccomadationType) {	
		SelectVisibileTextByXpath("//select[@name='acco_type']", AccomadationType);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectAccomadationGrade(String AccomadationGrade) {									
	SelectVisibileTextByXpath("//select[@name='star_rat']", AccomadationGrade);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterEmailId1(String emailId0) {
		enterByXpath("//input[@id='email']", emailId0);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterMobile1(String mobile1) {
		enterByXpath("//input[@id='mcontact']", mobile1);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterContact(String contact) {
		enterByXpath("//input[@id='contact']", contact);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterName2(String name2) {
		enterByXpath("//input[@name='name_o']", name2);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterAddress2(String Address2) {
		enterByXpath("//input[@name='address_o']", Address2);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectState2(String State2) {									
		SelectVisibileTextByXpath("//select[@name='state_o']", State2);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectCity2(String City2) {	
		SelectVisibileTextByXpath("//select[@name='citydistr_o']", City2);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterEmailId2(String emailId2) {
		enterByXpath("//input[@name='emailid_o']", emailId2);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterPhone2(String Phone2) {
		enterByXpath("//input[@name='phoneno_o']", Phone2);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterMobile2(String Mobile2) {
		enterByXpath("//input[@name='mobile_o']", Mobile2);
		return new FormCRegistration();
	}
	
	public FormCRegistration clickAdd() {
		clickByXpath("//input[@value='Add']");
		return this;
	}
	
	
	
	public FormCRegistration enterName3(String name3) {
		enterByXpath("//input[@name='name_o']", name3);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterAddress3(String Address3) {
		enterByXpath("//input[@name='address_o']", Address3);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectState3(String State3) {									
		SelectVisibileTextByXpath("//select[@name='state_o']", State3);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectCity3(String City3) {	
		SelectVisibileTextByXpath("//select[@name='citydistr_o']", City3);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterEmailId3(String emailId3) {
		enterByXpath("//input[@name='emailid_o']", emailId3);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterPhone3(String Phone3) {
		enterByXpath("//input[@name='phoneno_o']", Phone3);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterMobile3(String Mobile3) {
		enterByXpath("//input[@name='mobile_o']", Mobile3);
		return new FormCRegistration();
	}
	
	
	
	public FormCRegistration enterName4(String name4) {
		enterByXpath("//input[@name='name_o']", name4);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterAddress4(String Address4) {
		enterByXpath("//input[@name='address_o']", Address4);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectState4(String State4) {									
		SelectVisibileTextByXpath("//select[@name='state_o']", State4);
		return new FormCRegistration();
	}
	
	public FormCRegistration selectCity4(String City4) {	
		SelectVisibileTextByXpath("//select[@name='citydistr_o']", City4);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterEmailId4(String emailId4) {
		enterByXpath("//input[@name='emailid_o']", emailId4);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterPhone4(String Phone4) {
		enterByXpath("//input[@name='phoneno_o']", Phone4);
		return new FormCRegistration();
	}
	
	public FormCRegistration enterMobile4(String Mobile4) {
		enterByXpath("//input[@name='mobile_o']", Mobile4);
		return new FormCRegistration();
	}
	
}


