package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ProjectWrappers extends GenericWrappers {
	
	public String browserName;
	public String url;
	public String sheetName;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
		
	}
	@BeforeTest
public void beforeTest() {
		loadObject();
		
	}

	@BeforeMethod
public void beforeMethod() {
		startTest(testCaseName, description);
		invokeApp(browserName, url);
	}
	@AfterMethod
public void afterMethod() {
		closeAllBrowsers();
		
	}
	@AfterClass
public void afterClass() {
		endTest();
	}
	@AfterTest
public void afterTest() {
		unloadObject();
		
	}
	@AfterSuite
public void afterSuite() {
		endReport();
		
	}
	@DataProvider (name="fetchData")
	public String[][] getTestData(){
		String [][] data=DataInputProvider.getData(sheetName);
		return data;
	}

	

}
