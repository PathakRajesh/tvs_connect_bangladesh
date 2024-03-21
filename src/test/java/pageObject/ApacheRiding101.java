package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ApacheRiding101 extends AndroidActions {

	public ApacheRiding101(WebDriver driver) {
		super(driver);
		
	}
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Riding 101']")
     private WebElement ridingtips;
	 
	 @AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id=\"com.tvsm.connect.bangladesh:id/iv_image\"])[7]")
	 private WebElement Ridingvideos;
	 
	 //Actions
	 
	 public boolean riding101()
	 {
		 ridingtips.click();
		 boolean videothumbnail=Ridingvideos.isDisplayed();
		 return videothumbnail; 
	}
	 public void backmenu()
	 {
	 BackIcon();
	 }

}
