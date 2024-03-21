package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ReRideDetails extends AndroidActions{

	public ReRideDetails(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Ride Details']")
	private WebElement RideDetails;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Last Ride Information']")
	private WebElement LastRideInformation;
		
//Actions
	
	public String ridedetail()
	{
		RideDetails.click();
		LastRideInformation.click();
		BackIcon();
		return "Ride Details";
	}

}
	



