package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class MyRides extends AndroidActions{

	public MyRides(WebDriver driver) {
		super(driver);
	
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='My Rides']")
	private WebElement MyRidesList;
	
	//Actions
	
	public String rtr1604vmyrides()
	{
		MyRidesList.click();
		BackIcon();
		return "My Rides";
	}
	public void myrides()
	{
		MyRidesList.click();
		BackIcon();
		
		}


}


