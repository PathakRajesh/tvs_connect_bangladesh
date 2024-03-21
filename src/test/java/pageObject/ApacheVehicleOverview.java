package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ApacheVehicleOverview extends AndroidActions {

	public ApacheVehicleOverview(WebDriver driver) {
		super(driver);
		
	}
	 @AndroidFindBy(xpath="//android.widget.LinearLayout[@resource-id='com.tvsm.connect.bangladesh:id/layout_tiles']/child::android.widget.LinearLayout[@package='com.tvsm.connect.bangladesh'][1]/child::android.widget.LinearLayout[@package='com.tvsm.connect.bangladesh'][1]")
		private WebElement VehicleOverview;
     
     @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/image_tvs_racing")
     private WebElement imgTVSRacing;
     
     //Actions
		
		public boolean vehicleoverview()
		{
			VehicleOverview.click();
			boolean tvsimg=imgTVSRacing.isDisplayed();
			return tvsimg;
		}
		public void apachebackmenu()
		{
		ApacheBackbtn();
		}
		
			
}


