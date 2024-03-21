package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class AddApache1602vFI extends AndroidActions{

	public AddApache1602vFI(WebDriver driver) {
		super(driver);
	
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='RTR 160 2V FI']/..[@resource-id='com.tvsm.connect.bangladesh:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.bangladesh:id/up_down_arrows']")
    private WebElement Add1602VFI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='RTR 160 2V FI']/..[@resource-id='com.tvsm.connect.bangladesh:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.bangladesh:id/up_down_arrows']")
	private WebElement VehicleArrowClk;
	
	
  public void addnewapachebike(String Text)
  {
	  Addnewbike();
	  Add1602VFI.click();
	  addVehicle();
	  ScrollToText(Text);
	  VehicleArrowClk.click();
	  
	  
  }

}



