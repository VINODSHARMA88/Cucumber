package stepDefinitions;


import org.openqa.selenium.WebDriver;



import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
;

public class RoomPageStepDefinitions {

	WebDriver driver;
	TestContextSetup testContextSetup;



	public RoomPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		//this.roomPage= testContextSetup.pageObjectManager.getRoomPage();
		//this.genericUtils=testContextSetup.genericUtils;
	}
	
	@Then("close activity panel")
	public void close_activity_panel() throws InterruptedException {
		testContextSetup.genericUtils.swtichToChildWindow();
		
		testContextSetup.pageObjectManager.getRoomPage().close_activity_panel();
	    
	}
}