package page.factory;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonclass.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	public CreateLead (RemoteWebDriver driverValue) {
		this.driver = driverValue;
	@BeforeTest
	public void setData() {
		excelFileName="tc001";
		testName="CreateLead";
		testDescription="Create Lead with mandatory";
		testCategory="functional";
		testAuthor="Balaji";
		}
	}
	@Test(dataProvider = "sendData")
	public void runCreateLead(String username, String password, String cname, String fname, String lname) {
		/*LoginPage page= new LoginPage();
		page.enterUsername(username);
		page.enterPsername(password);
		page.clickLogin_positive();
		
		WelcomePage page1=new WelcomePage();
		page1. clickCRMSFA();*/
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password);	
	}
	}