package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class Apache1602vFIVehicleDetails extends AndroidActions {

	public Apache1602vFIVehicleDetails(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@resource-id='com.tvsm.connect.bangladesh:id/layout_tiles']/child::android.widget.LinearLayout[@package='com.tvsm.connect.bangladesh'][1]/child::android.widget.LinearLayout[@package='com.tvsm.connect.bangladesh'][1]")
	private WebElement VehicleOverview;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Best 0-60']")
	private WebElement getpagetext; 
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Riding Patterns']")
    private WebElement RidingPattern;
    
    @AndroidFindBy(xpath="//android.widget.Button[@text='Vehicle Usage']")
    private WebElement VehicleUsage;
    
    //Actions
    
    public String vehicleoverview()
	{
		VehicleOverview.click();
		String pagetext=getpagetext.getText();
		return pagetext;
	}
    
    public void ridingpattern()
	{
		RidingPattern.click();
		VehicleUsage.click();
		ApacheBackbtn();
}
}


