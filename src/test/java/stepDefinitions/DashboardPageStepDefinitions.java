package stepDefinitions;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import Utils.TestContextSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardPageStepDefinitions {

	WebDriver driver;
	TestContextSetup testContextSetup;

	public DashboardPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Then("customer Dashboard spage should display and check dashboard title")
	public void customer_dashboard_spage_and_check_title() {

		String title = testContextSetup.pageObjectManager.getdashboardpage().getDashboardTitle();

		Assert.assertEquals(title, "Smart Room Dashboard", "login success");

	}

	@When("Click logout button")
	public void click_logout_button() {

		testContextSetup.pageObjectManager.getdashboardpage().getlogout();
	}

	@Then("Click profile link under setting and check pop up title")
	public void click_profile_link_under_setting_and_check_pop_up_title() {
		String poptitle = testContextSetup.pageObjectManager.getdashboardpage().getprofilepopupTitle();
		Assert.assertEquals(poptitle, "Profile", "title matched");
	}

	@Then("user click Room name")
	public void user_click_room_name() throws InterruptedException {
		testContextSetup.pageObjectManager.getdashboardpage().getroomname();
	}

}
