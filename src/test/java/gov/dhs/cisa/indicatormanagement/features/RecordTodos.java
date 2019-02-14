package gov.dhs.cisa.indicatormanagement.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//		plugin = {"pretty", "html:target/cucumber-html-report"},
		features = "src/test/resources/features/record_todos",
		tags = {"@ShouldPass"}
)
public class RecordTodos {
}