package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomPage {

	public WebDriver driver;

	public RoomPage(WebDriver driver)

	{

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(className = "back-container")
	WebElement crossicon;

	@FindBy(css = "h2[title='Activity']")
	WebElement panelname;

	public void close_activity_panel() throws InterruptedException {

		Thread.sleep(10000);
		String name = panelname.getText();

		System.out.println(name);
		crossicon.click();

	}

}
