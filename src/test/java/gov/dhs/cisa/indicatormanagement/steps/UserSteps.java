package gov.dhs.cisa.indicatormanagement.steps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import gov.dhs.cisa.indicatormanagement.pages.LandingPage;
import gov.dhs.cisa.indicatormanagement.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class UserSteps {

	private LoginPage loginPage;
	private LandingPage landingPage;

	@Step
	public void visit_the_website(String websiteUrl) {
		loginPage.openUrl(websiteUrl);
	}
	
	@Step
	public void login_with_credential(String username, String password) {
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.logIn();
	}

	@Step
	public void verify_login_success() {
		assertThat(landingPage.getHomeLabel(), equalTo("Home"));
		assertThat(landingPage.getBreadCrumbs().size(), equalTo(1));
	}
//
//	@Step
//	public void i_verify_access_denial_with(String expectedError) {
//		assertThat(yellowDogPage.getLoginDenialMsg(), equalTo(expectedError));
//	}

}
