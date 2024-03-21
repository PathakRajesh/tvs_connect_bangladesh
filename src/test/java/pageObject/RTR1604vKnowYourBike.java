package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class RTR1604vKnowYourBike extends AndroidActions {

	public RTR1604vKnowYourBike(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//*[contains(@text,'Know')]")
	private WebElement KnowYourBike;
	
	
	public String knowyourbike()
	{
		KnowYourBike.click();
		tips();
		specification();
		BackIcon();
		return "Know Your Bike";
	}
	
	} 



