package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;

	public Login(WebDriver driver) {

		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "Login")
	WebElement loginn;

	@FindBy(id = "forgot_password_link")
	WebElement forgot_link;


	public void login() {

		username.sendKeys("f3jhonsmith_766@outlook.com");
		pass.sendKeys("@Password10");
		loginn.click();

	}

	public String forgotlink() {

		String linktext = forgot_link.getText();

		System.out.println(linktext);
		return linktext;

	}

	

}
