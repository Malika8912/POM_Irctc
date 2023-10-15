package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		// start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start test
		ExtentTest test = report.startTest("TC005", "To verify IRCTC REgistration for the new user sign up");
		
		test.assignAuthor("Mallika");
		test.assignCategory("Functional");
		
		
		// log test steps
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		test.log(LogStatus.PASS, "The browser got launcehd with the url successfully");
		
		// end test
		report.endTest(test);		
		
		// end report
		report.flush();
		
		
	}

}
