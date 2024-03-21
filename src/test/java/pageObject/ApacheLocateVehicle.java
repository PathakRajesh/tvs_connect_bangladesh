package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ApacheLocateVehicle extends AndroidActions {

	public ApacheLocateVehicle(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@resource-id='com.tvsm.connect.bangladesh:id/layout_tiles']/child::android.widget.LinearLayout[@package='com.tvsm.connect.bangladesh'][1]/child::android.widget.LinearLayout[@package='com.tvsm.connect.bangladesh'][3]")
    private  WebElement LocateVehicle;
    
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Last Parked Location']")
    private WebElement backclk;
    
    //Actions
    
    public void locatevehicle()
    {
    LocateVehicle.click();
	  backclk.click();
    }
}


