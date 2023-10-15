package pom.alertsandframes.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage switchFrame() {
		switchToFrame("//iframe[@id='iframeResult']");
		return new HomePage();
	}
	
	public HomePage waitandhold() {
		waitproperty(5000);
		return this;
	}

	public Alerts clickTryIt() {
		clickByXpath("//button[text()='Try it']");
		return new Alerts();
	}
	
	public HomePage clickHome() {
		clickByXpath("//a[@id='tryhome']");
		return this;
	}
	
	public HomePage verifyText(String Text) {
		verifyTextContainsByXpath("//p[@id='demo']", Text);
		return this;	
	}
	
    public HomePage refreshPage() {
    	refresh();
    	return this;
	}
    
    public HomePage defaultTheContent() {
		defaultContent();
		return new HomePage();
	}
	
}
