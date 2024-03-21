package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ReLastParkedLocation extends AndroidActions{

	public ReLastParkedLocation(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Last Parked Location']")
	private WebElement LastParkLocation;
	
	//Actions
	
	public String lastparkLocation()
	{
	LastParkLocation.click();
	BackIcon();
	return "Last Parked Location";
	}
}



