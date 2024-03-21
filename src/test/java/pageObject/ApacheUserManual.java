package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ApacheUserManual extends AndroidActions {

	public ApacheUserManual(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='User Manual']")
    private WebElement usermanual;
	 
	 //Actions
	 
	 public void usermanual()
	 {
		    usermanual.click();
			tips();
			specification();
			BackIcon();
	 }


}
