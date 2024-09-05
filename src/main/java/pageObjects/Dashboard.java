package pageObjects;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {

	public WebDriver driver;
	WebDriverWait wait;

	public Dashboard(WebDriver driver)

	{

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='cust-srd-content-card--header slds-no-flex alignAndPaddingForHeading']")
	WebElement dashboard_title;

	@FindBy(xpath = "//button[@class='slds-button']")
	WebElement setting;

	@FindBy(css = "a[title='Logout'] span[class='slds-truncate']")
	WebElement logout;

	@FindBy(xpath = "//li[1]")
	WebElement profile;

	@FindBy(xpath = "//div[contains(@class,'customerProfileModalHeader')]/h2")
	WebElement popuptitle;

	@FindBy(xpath = "//div[@class='slds-card__header slds-grid']//a[@title=\"1 July QA SRS\"]")
	WebElement room;
	
	
	public void getlogout() {

		setting.click();
		logout.click();
	}

	public String getDashboardTitle() {

		String Ptitle = dashboard_title.getText();

		String dashboardtitle = Ptitle.substring(0, 20);
		System.out.println(dashboardtitle);
		return dashboardtitle;
	}

	public String getprofilepopupTitle() {

		setting.click();
		profile.click();
		String poptitle = popuptitle.getText();
		return poptitle;

	}
	
	public void getroomname() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(room));
		Thread.sleep(5000);
		room.click();
	}

	

	
}
