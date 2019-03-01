package gov.dhs.cisa.indicatormanagement.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LandingPage extends PageObject {

	@FindBy(xpath = "//a[@href='#/']")
	WebElement home;
	
	@FindBy(xpath = "//li[@ng-repeat='b in breadcrumbs']")
	List<WebElement> breadcrumbs;

	public String getHomeLabel() {
		return home.getText();
	}
	
	public List<WebElement> getBreadCrumbs() {
		return breadcrumbs;
	}
}