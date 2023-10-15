package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookSignUp extends GenericWrappers{
	
	public FaceBook clickNewAccount() {
		clickByXpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
		return new FaceBook();
	}

}
