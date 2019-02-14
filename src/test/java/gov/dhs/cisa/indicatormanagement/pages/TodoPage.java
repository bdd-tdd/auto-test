package gov.dhs.cisa.indicatormanagement.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.By;

public class TodoPage extends PageObject {
	public void addActionCalled(String actionName) {
		WebElement todoField = getDriver().findElement(By.cssSelector(".new-todo"));
		todoField.sendKeys(actionName);
		todoField.sendKeys(Keys.ENTER);
	}
	
	public List<String> getActions() {
		return findAll(".view").stream().map(WebElementFacade::getText).collect(Collectors.toList());
	}
	
}