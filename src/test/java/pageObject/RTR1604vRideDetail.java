package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class RTR1604vRideDetail extends AndroidActions{

	public RTR1604vRideDetail(WebDriver driver) {
		super(driver);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Ride Details']")
	private WebElement ridedetails;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Last Ride Information']/parent::android.widget.LinearLayout[@content-desc='Last Ride Information']")
	private WebElement LastRideInformation;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc='Overview']")
	private WebElement overview;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='VIEW PAST RIDES']")
	private WebElement ViewPastRides;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='TOUR NOW']")
	private WebElement Tournowbtn;
	
	
	//Actions
	
    public String rtrridedetails(String Text)
    {
    	ridedetails.click();
    	LastRideInformation.click();
    	overview.click();
    	ScrollToText(Text);
    	ViewPastRides.click();
    	BackIcon();
    	Tournowbtn.click();
    	BackIcon();
		return "Ride Details";
    }

}



