package page.factory;

import org.openqa.selenium.remote.RemoteWebDriver;

import commonclass.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage(RemoteWebDriver driverValue) {
        this.driver = driverValue;
    }
    public LeadsPage clickLeads() {
        WebElement elementLeads = driver.findElement(By.linkText(property.getProperty("homepage.leads")));
        elementLeads.click();
        return new LeadsPage(driver);	

}
