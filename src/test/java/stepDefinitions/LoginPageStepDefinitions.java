package stepDefinitions;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;

public class LoginPageStepDefinitions {

	public WebDriver driver;
	public TestContextSetup testContextSetup;
	public Login loginPage;

	public LoginPageStepDefinitions(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;

	}

	@Given("User is on login  page")
	public void user_is_on_login_page() {

		System.out.println("login page");

	}

	@When("Enter username,password and click login")
	public void enter_username_and_password() {

		testContextSetup.pageObjectManager.getLoginpage().login();

	}

	@Then("Check forgot password link in login page")
	public void check_forgot_password_link_in_login_page() {

		String linktext = testContextSetup.pageObjectManager.getLoginpage().forgotlink();

		Assert.assertEquals(linktext, "Forgot Your Password?", "link text matched");

	}

	/*
	 * 
	 * @When("Enter {string} and {string} and click login") public void
	 * enter_and(String Username, String Password) { WebElement username =
	 * testContextSetup.driver.findElement(By.id("username"));
	 * username.sendKeys(Username);
	 * 
	 * WebElement password = testContextSetup.driver.findElement(By.id("password"));
	 * password.sendKeys(Password); WebElement login =
	 * testContextSetup.driver.findElement(By.id("Login")); login.click(); }
	 * 
	 * @When("Enter {string} and {string} combination") public void
	 * enter_and_combination(String uname, String pass) { WebElement username=
	 * driver.findElement(By.id("username")); username.sendKeys(uname);
	 * 
	 * WebElement password = driver.findElement(By.id("password"));
	 * password.sendKeys(pass); }
	 * 
	 * 
	 * @When("^Enter(.+) and (.+) combination$") public void
	 * enter_and_combination(String uname, String pass) { WebElement username =
	 * testContextSetup.driver.findElement(By.id("username"));
	 * username.sendKeys(uname);
	 * 
	 * WebElement password = testContextSetup.driver.findElement(By.id("password"));
	 * password.sendKeys(pass); WebElement login =
	 * testContextSetup.driver.findElement(By.id("Login")); login.click(); }
	 * 
	 */



}
