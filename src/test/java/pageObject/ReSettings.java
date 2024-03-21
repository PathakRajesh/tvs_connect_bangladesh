package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ReSettings extends AndroidActions{

	public ReSettings(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	private WebElement VehicleSettings;

	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/iv_do_not_disturb")
	private WebElement DoNotDisturb;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/iv_auto_reply_sms")
	private WebElement AutoReplySmS;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id=\"com.tvsm.connect.bangladesh:id/iv_over_speed\"]")
	private WebElement OverSpeedLimit;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/distance_seekbar")
	private WebElement seekbar;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	private WebElement OK_btn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='SAVE']/parent::android.widget.LinearLayout[@package='com.tvsm.connect.bangladesh']")
    private WebElement Save_btn;
	
	//Actions
	
	public String settings()
	{
		VehicleSettings.click();
		DoNotDisturb.click();
		AutoReplySmS.click();
		OverSpeedLimit.click();
		dragndrop(seekbar);
		OK_btn.click();
		Save_btn.click();
		return "Settings";
	}

}


