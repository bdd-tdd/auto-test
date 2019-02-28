package gov.dhs.cisa.indicatormanagement.steps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import gov.dhs.cisa.indicatormanagement.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class UserSteps {

	private LoginPage loginPage;

	@Step
	public void visit_the_website(String websiteUrl) {
		loginPage.openUrl(websiteUrl);
	}

	@Step
	public void enter_user_name(String username) {
		loginPage.enterUserName(username);
	}

	@Step
	public void enter_password(String password) {
		loginPage.enterPassword(password);
	}

	@Step
	public void click_login_button() {
		loginPage.logIn();
	}
//
//	@Step
//	public void i_verify_human_review_pending_page_with_this_title(String expectedTitleText) {
//		assertThat(loginPage.getPageTitle(), equalTo(expectedTitleText));
//	}
//
//	@Step
//	public void i_verify_access_denial_with(String expectedError) {
//		assertThat(yellowDogPage.getLoginDenialMsg(), equalTo(expectedError));
//	}

}
