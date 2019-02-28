package gov.dhs.cisa.indicatormanagement.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import gov.dhs.cisa.indicatormanagement.pages.TodoPage;

@SuppressWarnings("serial")
public class User extends ScenarioSteps {
	TodoPage todoPage;

	private static Properties properties;
	private static String propertyFile = "src/test/resources/config.properties";

	public User() {
		try {
			loadProperties(propertyFile);
		} catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
	}

	private void loadProperties(String file) throws FileNotFoundException {
		properties = new Properties();
	    InputStream is = new FileInputStream(file);

	    try {
			properties.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Properties getSystemProperties() {
	    return properties;
	}

	@Step
	public void open_todo_application() {
		todoPage.open();		
	}

	@Step
	public void add_an_action_Called(String actionName) {
		todoPage.addActionCalled(actionName);
	}

	@Step
	public void should_see_action_called(String action) {
		assertThat(todoPage.getActions()).contains(action);		
	}
	
}