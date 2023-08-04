package page.factory;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonclass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="tc001";
		testName="LoginTest";
		testDescription="Login with Postive data";
		testCategory="smoke";
		testAuthor="Hari";
		}
	@Test(dataProvider = "sendData")
	public void runCreateLead(String username, String password, String cname, String fname, String lname) throws IOException {
		/*LoginPage page= new LoginPage();
		page.enterUsername(username);
		page.enterPsername(password);
		page.clickLogin_positive();
		
		WelcomePage page1=new WelcomePage();
		page1. clickCRMSFA();*/
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin_positive();
	}
	}