package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class RTR1604vSettings extends AndroidActions {

	public RTR1604vSettings(WebDriver driver) {
		super(driver);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	private WebElement vehicleSettings;

	@AndroidFindBy(id = "com.tvsm.connect.bangladesh:id/distance_seekbar")
	private WebElement seekbar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SAVE']/parent::android.widget.LinearLayout[@package='com.tvsm.connect.bangladesh']")
	private WebElement saveBtn;

	@AndroidFindBy(id = "com.tvsm.connect.bangladesh:id/tvRemoveBike")
	private WebElement removeVehicle;

	@AndroidFindBy(id = "com.tvsm.connect.bangladesh:id/bt_negative")
	private WebElement btn;

	@AndroidFindBy(xpath = ("(//android.widget.Toast)[1]"))
	private WebElement settingToastMsg;

	// Actions

	public String settings() {
		vehicleSettings.click();
		donotdisturb();
		autoreplysms();
		overspeedalert();
		dragndrop(seekbar);
		OK();
		return "Settings";
	}

	public void removeVehicle() {
		removeVehicle.click();
		btn.click();
		saveBtn.click();
	}

	public String settingToastMessage() {
		String toastmessage = settingToastMsg.getAttribute("name");
		return toastmessage;
	}

}
