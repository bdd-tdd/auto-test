package gov.dhs.cisa.indicatormanagement;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//		plugin = {"pretty", "html:target/cucumber-html-report"},
		features = "src/test/resources/features/authentication",
		tags = {"@Authentication"}
)
public class RunCukesTest {
}