package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;
	
	
	public GenericUtils(WebDriver driver)
	{
		
		this.driver=driver;
	}

	public void swtichToChildWindow()

	{

		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(mainWindowHandle);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();

		// Here we will check if child window has other child windows and will fetch the
		// heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			System.out.println(ChildWindow);
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);

				String title = driver.getTitle();
				System.out.println(title);
			}
		}
	}

}