package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class RTR1604vLastParkedLocation extends AndroidActions {

	public RTR1604vLastParkedLocation(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Last Parked Location']")
	private WebElement Last_Park_Location;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/button_grant")
	private WebElement OKSure;
	
	//Actions
	
	public String lastparkLocation(String Text)
	{
	Last_Park_Location.click();
	OKSure.click();
	BackIcon();
	ScrollToText(Text);
	return "Last Parked Location";

}
}


