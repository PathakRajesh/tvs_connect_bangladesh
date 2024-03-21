package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ReHowtoVideos extends AndroidActions{

	public ReHowtoVideos(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='How To Videos']")
	private WebElement HowtoVideos;
	
	//Action
	
	public void howtovideos(String Text)
	{
		HowtoVideos.click();
		BackIcon();
		ScrollToText(Text);

}
}


