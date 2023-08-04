package commonclass;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ProjectSpecificMethods {
public RemoteWebDriver driver;
public String excelFileName;
public static ExtentReports extent;
public static ExtentTest test;
public String testName, testDescription, testCategory, testAuthor;
@BeforeSuite
public void startReport () {
	ExtentHtmlReporter reporter = new ExtentHtmlReporter ("./reports/results.html");
	reporter.setAppendExisting(true);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
}
@BeforeClass
public void testcaseDetails () {
	test= extent.createTest(testName, testDescription);
	test.assignCategory(testCategory);
	test.assignAuthor(testAuthor);
}
@AfterSuite
public void stopReport() {
	extent.flush();
}
}




