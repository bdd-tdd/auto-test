package gov.dhs.cisa.indicatormanagement.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	public void enterUserName(String usrname) {
		username.sendKeys(usrname);		
	}

	public void enterPassword(String passwd) {
		password.sendKeys(passwd);		
	}

	public void logIn() {
		login.click();
	}
}