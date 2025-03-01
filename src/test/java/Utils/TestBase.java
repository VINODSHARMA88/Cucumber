package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException

	{
		
		Properties prop = new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
	
	prop.load(fis);
	
	String url=prop.getProperty("QaURL");
	String browser_properties = prop.getProperty("browser");
	String browser_maven=System.getProperty("browser");
	// result = testCondition ? value1 : value2
	
	String browser = browser_maven!=null ? browser_maven : browser_properties;
	

		
		if (driver == null) {
		

			if( browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("WebDriver.Chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\ chromedriver.exe")	;
				driver = new ChromeDriver();

				
			}
			else if(browser.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("Edge")) {
				
				driver = new EdgeDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			return driver;
		}
		return driver;

	}
}
