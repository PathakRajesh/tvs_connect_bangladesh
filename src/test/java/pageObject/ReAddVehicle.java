package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ReAddVehicle extends AndroidActions{

	public ReAddVehicle(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Racing Edition']/..[@resource-id='com.tvsm.connect.bangladesh:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.bangladesh:id/up_down_arrows']")
	private WebElement Add_Vehicle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Racing Edition']/..[@resource-id='com.tvsm.connect.bangladesh:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.bangladesh:id/up_down_arrows']")
	private WebElement clkDownarrow;
	
	//Actions
	
	public void addvehicles() throws InterruptedException
	{
		Addnewbike();
		Add_Vehicle.click();
		addVehicle();
		clkDownarrow.click();
		
	}

	}
	


