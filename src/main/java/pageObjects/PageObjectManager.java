package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	Login loginpage;
	
	Dashboard dashboardpage;
	RoomPage roomPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}


	public Login getLoginpage()
	{
		
		loginpage= new Login(driver);
		
		return loginpage;
		
		
	}
	

	public Dashboard getdashboardpage()
	{
		
		dashboardpage= new Dashboard(driver);
		
		return dashboardpage;
		
		
	}
	public RoomPage getRoomPage()
	{
		
		roomPage= new RoomPage(driver);
		
		return roomPage;
		
		
	}


}
