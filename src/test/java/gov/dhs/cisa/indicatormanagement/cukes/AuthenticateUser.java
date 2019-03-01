package gov.dhs.cisa.indicatormanagement.cukes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gov.dhs.cisa.indicatormanagement.steps.UserSteps;
import gov.dhs.cisa.indicatormanagement.util.CommonUtil;
import net.thucydides.core.annotations.Steps;

public class AuthenticateUser {
	@Steps
	private UserSteps userSteps;

	@Given("^the user is a regular user of the application with a valid credential$")
	public void the_user_is_a_regular_user_of_the_application_with_a_valid_credential()
			throws Exception {
		CommonUtil.setUsername(CommonUtil.get("regular.username"));
		CommonUtil.setPassword(CommonUtil.get("regular.password"));
	}

	@Given("^the user logins the website$")
	public void the_user_logins_the_website() throws Exception {
		userSteps.visit_the_website(getWebSite());
		userSteps.login_with_credential(getUsername(), getPassword());
	}

	@Given("^the user should be presented with a landing page$")
	public void the_user_should_be_presented_with_a_landing_page() throws Exception {
		userSteps.verify_login_success();
	}

//	@Then("^I should be denied access\\.$")
//	public void i_should_be_denied_access() throws Exception {
//		userSteps.i_verify_access_denial_with(CommonUtil.get("login.error.msg"));
//	}

	private String getPassword() {
		return CommonUtil.getPassword();
	}

	private String getUsername() {
		return CommonUtil.getUsername();
	}

	private String getWebSite() {
		return CommonUtil.get("webapp.url");
	}

}
