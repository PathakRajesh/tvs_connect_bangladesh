package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class AddApache1602vCarb extends AndroidActions{

	public AddApache1602vCarb(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='RTR 160 2v NON-ABS']/..[@resource-id='com.tvsm.connect.bangladesh:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.bangladesh:id/up_down_arrows']")
    private WebElement Selectnewbike;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='RTR 160 2v NON-ABS']/..[@resource-id='com.tvsm.connect.bangladesh:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.bangladesh:id/up_down_arrows']")
	private WebElement Downarrow;
	
	//Actions
	
	public void addnewvehicle(String Text)
	{
		
		Addnewbike();
		Selectnewbike.click();
		addVehicle();
		ScrollToText(Text);
		Downarrow.click();
	}
	
}



