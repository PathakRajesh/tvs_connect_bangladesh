package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ApacheSettings extends AndroidActions {

	public ApacheSettings(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
    private WebElement Settings;
    
    @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/rlNavigateVehicleInfo")
    private WebElement VehicleInfo;
    
    @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/vehicle_info_img")
    private WebElement Vehicleinfoimg;
    
    @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/rlVoiceAssist")
    private WebElement VoiceAssist;
    
    //Actions
    
    public boolean vehicleinfo()
    {
    	Settings.click();
		VehicleInfo.click();
		boolean vehicleimg=Vehicleinfoimg.isDisplayed();
		savebtn();
		return vehicleimg;
    }
   
    public void voiceassist()
    {
    	VoiceAssist.click();
    	ApacheVoiceAssist();
    	ApacheVoiceAssist();
    	ApacheVoiceFeedback();
    	ApacheVoiceFeedback();
    	savebtn();
    }
    public void settinginfo()
    {
		overspeedalert();
		donotdisturb();
		autoreplysms();
		savebtn();
		
    }
    
}


