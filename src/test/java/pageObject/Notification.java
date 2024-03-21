package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class Notification extends AndroidActions {

	public Notification(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/imgBell")
	private WebElement notification;
	
	//Action
	public void notification()
	{
		notification.click();
		BackIcon();
	}

}


