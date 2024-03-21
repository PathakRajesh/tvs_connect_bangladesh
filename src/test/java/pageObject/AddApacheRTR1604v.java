package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class AddApacheRTR1604v extends AndroidActions{

	public AddApacheRTR1604v(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='RTR 160 4v']/..[@resource-id='com.tvsm.connect.bangladesh:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.bangladesh:id/up_down_arrows']")
	private WebElement addRTR1604v;
	
	
	//Action
	public void addvehicle() throws InterruptedException
	{
		addRTR1604v.click();
		addVehicle();
		allowAppPermission();
	}

}
