package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class RTR1604vMyTour extends AndroidActions {

	public RTR1604vMyTour(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='My Tours']")
	private WebElement Mytour;
	
	//Actions
	
	public String mytour()
	{
		Mytour.click();
		BackIcon();
		return "My Tours";
		
	}

}


